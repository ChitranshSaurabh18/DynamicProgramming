package org.saurabh.dynamicprogramming;

import java.util.*;

/**
 * Problem Link: https://www.geeksforgeeks.org/travelling-salesman-problem-set-1/
 *
 * @author Saurabh, Chitransh
 */
public class TravellingSalesman {

    private int[][]                 cost;            // stores the cost matrix
    private int                     source;          // the source vertex
    private int                     noOfVertices;    // the no of vertices in the graph
    private int                     minCostPath;     // min cost path of the tour
    private List<Integer>           path;            // path taken by the traveller
    private Map<Vertex, Integer>    minCostMap;      // for intermediate results (can’t use array)
    private Map<Vertex, Vertex>     previousMap;     // for intermediate results (can’t use array)

    // to sort intermediate vertices like:  {}, {1}, {2}, {3}, {1,2}, {2,3}, {1,3} and {1,2,3}
    private static Comparator<Set<Integer>> comparator =
            (set1, set2) -> ((Integer) set1.size()).compareTo(set2.size());

    public TravellingSalesman (int source, int[][] cost) {
        assert cost.length == cost[0].length;   // should be a square matrix
        this.source = source;
        this.cost = cost;
        this.noOfVertices = cost.length;
        this.path = new ArrayList<>();
        this.minCostMap = new HashMap<>();
        this.previousMap = new HashMap<>();

        solve();  // can be moved out of the constructor as well
    }

    public void solve () {
        List<Set<Integer>> intermediateVerticesSet = generate(noOfVertices, source);
        Collections.sort(intermediateVerticesSet, comparator);

        for (Set<Integer> intermediateVertices : intermediateVerticesSet) {
            for (int v = 0; v < noOfVertices; v++) {

                if (v == source && intermediateVertices.size() != noOfVertices -1) {
                    continue;  // we should only be calculating (0,{1,2,3}) only and not (0,{1,2}) etc
                }

                if (intermediateVertices.contains(v)) {
                    continue;  // we should not be calculating (1, {1}) or (1, {1,2}) etc
                }

                Vertex vertex = new Vertex (v, intermediateVertices);
                if (vertex.intermediateVertices().isEmpty()) {
                    minCostMap.put(vertex, cost[this.source][v]);
                    previousMap.put(vertex, null);
                } else {
                    Integer currentMinCost = Integer.MAX_VALUE;
                    Vertex previousVertex = null;

                    for (Integer w : vertex.intermediateVertices()) {
                        Vertex intermediateVertex = vertex.makeIntermediateAsCurrentVertex (w);
                        if (cost[w][v] + minCostMap.get (intermediateVertex) < currentMinCost) {
                            currentMinCost = cost[w][v] + minCostMap.get (intermediateVertex);
                            previousVertex = intermediateVertex;
                        }
                    }

                    minCostMap.put (vertex, currentMinCost);
                    previousMap.put (vertex, previousVertex);
                }
            }
        }

        // get the final vertex: [0, {1, 2, 3}]
        Integer lastIndex = intermediateVerticesSet.size() - 1;
        Set<Integer> finalIntermediateVertices = intermediateVerticesSet.get(lastIndex);
        Vertex current = new Vertex(source, finalIntermediateVertices);

        this.minCostPath = minCostMap.get(current);

        // traverse the path taken by starting from [0, {1, 2, 3}] and following previous pointers
        while (!current.intermediateVertices().isEmpty()) {
            Vertex previous = this.previousMap.get(current);
            this.path.add (0, previous.current());  // store results backwards, so add at first index
            current = previous;
        }

        this.path.add (0, source);          // first vertex should be the source itself
        this.path.add (source);             // last vertex should be the source itself
    }

    public int getMinCostPath () {
        return minCostPath;
    }

    public List<Integer> getPath () {
        return path;
    }

    // for noOfVertices = 3 and source = 0, we get {}, {1}, {2}, {3}, {1,2}, {2,3}, {1,3} and {1,2,3}
    public static List<Set<Integer>> generate (int noOfVertices, int source) {
        List<Integer> vertices = new ArrayList<>();
        for (int v = 0; v < noOfVertices; v++) {
            if (v != source) {
                vertices.add(v);
            }
        }
        return generate(vertices);
    }

    private static List<Set<Integer>> generate (List<Integer> vertices) {
        List<Set<Integer>> powerSet = new ArrayList<>();
        if (vertices.isEmpty()) {
            powerSet.add(new HashSet<Integer>());
            return powerSet;
        }

        List<Integer> list = new ArrayList<>(vertices);
        Integer head = list.get(0);
        List<Integer> rest = new ArrayList<>(list.subList(1, list.size()));

        for (Set<Integer> set : generate(rest)) {
            Set<Integer> newSet = new HashSet<>();
            newSet.add(head);
            newSet.addAll(set);
            powerSet.add(newSet);
            powerSet.add(set);
        }
        return powerSet;
    }

    public class Vertex {

        private Integer           current;
        private Set<Integer>      intermediates;

        public Vertex (Integer current, Set<Integer> intermediates) {
            this.current = current;
            this.intermediates = intermediates;
        }

        public Integer current () {
            return current;
        }

        public Set<Integer> intermediateVertices () {
            return intermediates;
        }

        public Vertex makeIntermediateAsCurrentVertex (Integer newCurrent) {
            assert intermediates.contains (newCurrent);
            Set<Integer> newIntermediates = new HashSet<>();
            for (Integer intermediateVertex : intermediates) {
                if (!newCurrent.equals (intermediateVertex)) {
                    newIntermediates.add (intermediateVertex);
                }
            }

            return new Vertex(newCurrent, newIntermediates);
        }

        @Override
        public boolean equals (Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || getClass() != object.getClass()) {
                return false;
            }

            Vertex that = (Vertex) object;
            if (!this.current.equals(that.current)) {
                return false;
            }

            if (this.intermediates.size() != that.intermediates.size()) {
                return false;
            }

            for (Integer v : this.intermediates) {
                if (!that.intermediates.contains(v)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int hashCode () {
            return Objects.hash(current, intermediates);
        }
    }
}
