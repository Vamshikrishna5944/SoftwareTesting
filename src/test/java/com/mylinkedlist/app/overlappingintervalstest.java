package com.mylinkedlist.app;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.Rule;

import org.junit.contrib.java.lang.system.SystemOutRule;



public class overlappingintervalstest {

	@Test
	public void testChange() {
		overlappingintervals oli  = new overlappingintervals() ;

        // test 1
        int[][] arr1 = {{6,7},{1, 3}, {1, 6}, {3, 4}, {4, 4}, {4, 5}, {5, 5}, {6, 6}, {6, 6},{1,2}};
        List<List<Integer>> ans1 = new ArrayList<>();
        ans1.add(new ArrayList<>(Arrays.asList(1, 7)));
        assertEquals(ans1, oli.mergeOverlappingIntervals(arr1));

        int[][] arr2 = {
            {2, 2},
            {2, 3},
            {2, 5},
            {3, 6},
            {4, 4},
            {4, 5},
            {6, 6}
        };
        List<List<Integer>> ans2 = Arrays.asList(
            Arrays.asList(2, 6)
        );
        assertEquals(ans2, oli.mergeOverlappingIntervals(arr2));

        int[][] arr3 = {
            {1, 4},
            {3, 3},
            {3, 3},
            {5, 5},
            {3, 4},
            {4, 4},
            {3, 3},
            {5, 5},
            {5, 6}
        };
        List<List<Integer>> ans3 = Arrays.asList(
            Arrays.asList(1, 4),
            Arrays.asList(5, 6)
        );
        assertEquals(ans3, oli.mergeOverlappingIntervals(arr3));

        int[][] arr4 = {
            {1, 3},
            {2, 6},
            {4, 4},
            {4, 6},
            {5, 5},
            {6, 6}
        };
        List<List<Integer>> ans4 = new ArrayList<>();
        ans4.add(new ArrayList<>(Arrays.asList(1, 6)));
        assertEquals(ans4, oli.mergeOverlappingIntervals(arr4));

        int[][] arr5 = {
            {1, 2},
            {1, 3},
            {1, 6},
            {2, 2},
            {2, 3},
            {3, 4},
            {3, 6},
            {5, 5},
            {5, 6}
        };
        List<List<Integer>> ans5 = new ArrayList<>();
        ans5.add(new ArrayList<>(Arrays.asList(1, 6)));
        assertEquals(ans5, oli.mergeOverlappingIntervals(arr5));
	}
	
	
}