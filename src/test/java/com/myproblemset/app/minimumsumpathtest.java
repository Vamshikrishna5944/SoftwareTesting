package com.myproblemset.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Rule;

import org.junit.contrib.java.lang.system.SystemOutRule;

public class minimumsumpathtest 
{
    
    @Test
    public void testsum()
    {
         minimumsumpath msp  = new minimumsumpath();
        //  int[][] grid1 = {};
        //  assertEquals(Integer.MAX_VALUE, msp.minSumPath(grid1)); 

         int[][] grid2 = {{5}};
         assertEquals(5, msp.minSumPath(grid2));

         int[][] grid3 = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
         };
         assertEquals(7, msp.minSumPath(grid3));
         
         int[][] grid4 = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        int result = msp.minSumPath(grid4);
        assertEquals(0, result);
    }
}
