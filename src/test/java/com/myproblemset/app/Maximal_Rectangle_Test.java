package com.myproblemset.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Maximal_Rectangle_Test {
    @Test
	public void testChange() {
		Maximal_Rectangle ccs = new Maximal_Rectangle(); 
		
		// Test 1
		char [][] nums = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        assertEquals(6,ccs.Solution(nums));

        char [][] nums1= {{'0'}};
        assertEquals(0,ccs.Solution(nums1));

        char [][] nums2= {{'1'}};
        assertEquals(1,ccs.Solution(nums2));

        char [][] nums3 = {{'1','1','1','1','1'},{'1','1','1','1','1'},{'1','1','1','1','1'},{'1','1','1','1','1'}};
        assertEquals(20,ccs.Solution(nums3));
        // int [] nums1 = {4,-2,-3,4,1};
        // assertEquals(59,ccs.Solution(nums1));

    }
    
}
