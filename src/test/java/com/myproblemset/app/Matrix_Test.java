package com.myproblemset.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Matrix_Test {
     @Test
	public void testChange() {
		Matrix ccs = new Matrix(); 
		// Test 1
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
        List<Integer> ans = Arrays.asList(1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10);
        assertEquals(ans, ccs.Solution(a));

     //    int a1[][] = {};
     //    List<Integer> ans1 = Arrays.asList();
     //    assertEquals(ans1, ccs.Solution(a1));



        

	}
    
}
