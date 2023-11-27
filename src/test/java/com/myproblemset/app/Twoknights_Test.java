package com.myproblemset.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class Twoknights_Test {
    @Test
	public void testChange() {
		Twoknights ccs = new Twoknights(); 
		
		// Test 1
		int n = 8;
        long [] ans = {0,6,28,96,252,550,1056,1848};
        assertArrayEquals(ans,ccs.solution(n));

        int n1 = 1;
        long [] ans1 = {0};
        assertArrayEquals(ans1,ccs.solution(n1));

        int n2 = 2;
        long [] ans2 = {0,6};
        assertArrayEquals(ans2,ccs.solution(n2));  
        
        int n3 = 14;
        long [] ans3 = {0,6,28,96,252,550,1056,1848,3016,4662,6900,9856,13668,18486};
        assertArrayEquals(ans3,ccs.solution(n3));  

        
}
}
