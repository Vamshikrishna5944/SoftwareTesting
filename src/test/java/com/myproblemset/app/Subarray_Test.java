package com.myproblemset.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Subarray_Test {
    @Test
	public void testChange() {
		Subarray_Ranges ccs = new Subarray_Ranges(); 
		
		// Test 1
		int [] nums = {1,2,3};
        assertEquals(4,ccs.solution(nums));

        int [] nums1 = {4,-2,-3,4,1};
        assertEquals(59,ccs.solution(nums1));

    }
    
}
