package com.myproblemset.app;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tri_1Test {

    @Test
    public void testFindMaximumXOR() {
        tri_1 tri = new tri_1();

        // Test Case 1
        int[] nums1 = {3, 10, 5, 25, 2, 8};
        assertEquals(28, tri.findMaximumXOR(nums1));


        // Test Case 3
        int[] nums3 = {7};
        assertEquals(0, tri.findMaximumXOR(nums3));

        // Test Case 4
        int[] nums4 = {0, 0, 0, 0};
        assertEquals(0, tri.findMaximumXOR(nums4));

        // Test Case 5
        int[] nums5 = {15, 15, 15, 15};
        assertEquals(0, tri.findMaximumXOR(nums5));

        // Test Case 6
        int[] nums6 = {-2, -5, -8, -1};
        assertEquals(7, tri.findMaximumXOR(nums6));

        // Test Case 7
        int[] nums7 = {2, -5, 8, -1, 3};
        assertEquals(-3, tri.findMaximumXOR(nums7));

        // Test Case 8
        int[] nums8 = {1000000, 999999, 888888, 777777};
        assertEquals(413193, tri.findMaximumXOR(nums8));

        // Test Case 9
        int[] nums9 = {3, 5, 3, 5, 10};
        assertEquals(15, tri.findMaximumXOR(nums9));

        // Test Case 10 (Performance Test)
        int[] nums10 = generateLargeArray();
        long startTime = System.currentTimeMillis();
        tri.findMaximumXOR(nums10);
        long endTime = System.currentTimeMillis();
    }

    private int[] generateLargeArray() {
        // Generate a large array of random integers
        int[] nums = new int[1000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return nums;
    }
}
