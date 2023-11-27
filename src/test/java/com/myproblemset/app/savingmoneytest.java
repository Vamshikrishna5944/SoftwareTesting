package com.myproblemset.app;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.Rule;

import org.junit.contrib.java.lang.system.SystemOutRule;

public class savingmoneytest 
{
    @Test
	public void testChange() 
    {
        savingmoney sm = new savingmoney();
        int[][] inputArray = {
            {0, 1, 5},
            {0, 2, 10},
            {1, 3, 50},
            {2, 3, 10}
        };
        List<List<Integer>> list1 = new ArrayList<>();
        for (int[] row : inputArray) {
            list1.add(Arrays.asList(row[0], row[1], row[2]));
        }
        assertEquals(20, sm.savingMoney(4,0,3,2,list1));

        int[][] input2 = {
            {2, 0, 2},
            {1, 2, 2}
        };
        List<List<Integer>> list2 = new ArrayList<>();
        for (int[] row : input2) {
            list2.add(Arrays.asList(row[0], row[1], row[2]));
        }
        assertEquals(-1, sm.savingMoney(3,0,2,2,list2));
    }

}
