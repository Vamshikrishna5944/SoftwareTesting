package com.myproblemset.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Inversion_Test {

    @Test
	public void testChange() {
		Inversion_count ccs = new Inversion_count(); 
        int [] arr = { 1, 20, 6, 4, 5 };
        assertEquals(5,ccs.mergeSortAndCount(arr,0,arr.length-1));

        int [] arr1 = {1,2,3,4,5,6,7,8};
        assertEquals(0,ccs.mergeSortAndCount(arr1,0,arr1.length-1));

        int [] arr2 = {10,9,8,7,6,5,4,3,2,1};
        assertEquals(45,ccs.mergeSortAndCount(arr2,0,arr2.length-1));

        int [] arr3 = { 1, 6, 20,4, 5 };
        assertEquals(4,ccs.mergeSortAndCount(arr3,0,arr3.length-1));

        int [] arr4 = { 6,1,20,4, 5,7,9,11,10,13};
        assertEquals(11,ccs.mergeSortAndCount(arr4,0,arr4.length-1));

        int [] arr5 = {1,4,5,6,20,7,9,11,10,13};
        assertEquals(6,ccs.mergeSortAndCount(arr5,0,arr5.length-1));

        int [] arr6 = {1,1,1,1};
        assertEquals(0,ccs.mergeSortAndCount(arr6,0,arr6.length-1));
	}
    
}
