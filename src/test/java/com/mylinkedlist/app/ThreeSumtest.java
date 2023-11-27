package com.mylinkedlist.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import java.util.*;
public class ThreeSumtest {
    threeSum ts=new threeSum();
    @Test
    public void testThreeSum(){
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = threeSum.threeSum_(nums1);
        List<List<Integer>> expected1 = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        assertArrayEquals(result1.toArray(), expected1.toArray());

    }
    @Test
    public void testThreeSum1(){
        int[] nums1 = {0, 0, 0, 0};
        List<List<Integer>> result1 = threeSum.threeSum_(nums1);
        List<List<Integer>> expected1 = Arrays.asList(Arrays.asList(0, 0, 0));
        assertArrayEquals(result1.toArray(), expected1.toArray());
    }
    @Test
    public void testThreeSum2(){
        int[] nums1 = {};
        List<List<Integer>> result1 = threeSum.threeSum_(nums1);
        List<List<Integer>> expected1 = Arrays.asList();
        assertArrayEquals(result1.toArray(), expected1.toArray());
    }
}