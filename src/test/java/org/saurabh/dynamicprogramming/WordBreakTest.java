package org.saurabh.dynamicprogramming;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.WordBreak.*;

/**
 * @author Saurabh, Chitransh
 */
public class WordBreakTest {

    @Test
    public void testIsWordBreakPossible () throws Exception {
        Set<String> wordSet = Sets.newHashSet("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango");
        assertEquals(true, isWordBreakPossible("ilike", wordSet));
        assertEquals(true, isWordBreakPossible("ilikesamsung", wordSet));
        assertEquals(false, isWordBreakPossible("ilikesamsungdynamo", wordSet));
    }

    @Test
    public void testWordBreak () throws Exception {
        Set<String> wordSet = Sets.newHashSet("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango");
        assertEquals(Lists.newArrayList("i", "like"), wordBreak("ilike", wordSet));
        assertEquals(Lists.newArrayList("i", "like", "mango"), wordBreak("ilikesamsung", wordSet));
        assertEquals(Lists.newArrayList(), wordBreak("ilikesamsungdynamo", wordSet));
    }
}