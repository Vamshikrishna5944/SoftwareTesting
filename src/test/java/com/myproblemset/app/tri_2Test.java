package com.myproblemset.app;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
public class tri_2Test {

    @Test
    public void maximizeXor() {
        tri_2 solution = new tri_2();

        // Test case with a single element in nums and a single query
        int[] nums1 = {5};
        int[][] queries1 = {{2, 3}};
        assertArrayEquals(new int[]{-1}, solution.maximizeXor(nums1, queries1));

        // Test case with multiple elements in nums and multiple queries
        int[] nums2 = {3, 10, 5, 25, 2, 8};
        int[][] queries2 = {{3, 7}, {14, 15}, {0, 10}};
        assertArrayEquals(new int[]{6, 13, 10}, solution.maximizeXor(nums2, queries2));

        // Test case with nums and queries containing negative numbers
        int[] nums3 = {-5, -2, -8, -1};
        int[][] queries3 = {{-10, -3}, {-6, -5}};
        assertArrayEquals(new int[]{14, 2}, solution.maximizeXor(nums3, queries3));

        // Test case with nums and queries containing large numbers
        int[] nums4 = {1000000, 500000, 750000};
        int[][] queries4 = {{800000, 900000}, {700000, 950000}};
        assertArrayEquals(new int[]{758816,855872}, solution.maximizeXor(nums4, queries4));

        // Test case with an empty nums array and queries
        int[] nums5 = {};
        int[][] queries5 = {{1, 5}, {0, 3}};
        assertArrayEquals(new int[]{-1, -1}, solution.maximizeXor(nums5, queries5));
    }
}
