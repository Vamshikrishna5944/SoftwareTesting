package com.myproblemset.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Allocation_Test {
    @Test
	public void testChange() {
		Allocation ccs = new Allocation(); 
        int [] arr = { 12, 34, 67,90 };
        int m=2;
        assertEquals(113,ccs.findPages(arr,arr.length,m));

        int [] arr1 = { 15,17,20};
        int m1=2;
        assertEquals(32,ccs.findPages(arr1,arr1.length,m1));

        int [] arr2 = { 15,17,20,33,45,67,89,92};
        int m2=8;
        assertEquals(92,ccs.findPages(arr2,arr2.length,m2));

        int [] arr3 = {1,2,3,4,5,6,7,8,9,10,94};
        int m3=2;
        assertEquals(94,ccs.findPages(arr3,arr3.length,m3));

        int [] arr4 = {1,2,3};
        int m4=4;
        assertEquals(-1,ccs.findPages(arr4,arr4.length,m4));

	}
}
