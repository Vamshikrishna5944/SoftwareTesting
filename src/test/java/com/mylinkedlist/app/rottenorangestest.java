package com.mylinkedlist.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Rule;

import org.junit.contrib.java.lang.system.SystemOutRule;

public class rottenorangestest {
    

    @Test
	public void testChange() 
    {
         rottenoranges ro = new rottenoranges();
         int[][] array1 = {
            {0},
            {0}
        };
        assertEquals(0, ro.orangesRotting(array1));

        int[][] array2 = {
            {2, 1, 1},
            {1, 1, 0},
            {1, 1, 1}
        };
        assertEquals(4, ro.orangesRotting(array2));

        int[][] array3 = {
            {2, 1, 1, 1},
            {1, 1, 1, 2}
        };
        assertEquals(2, ro.orangesRotting(array3));

        int[][] array4 = {
            {2, 1, 1, 0},
            {0, 1, 2, 0},
            {0, 0, 1, 1},
            {2, 1, 1, 0}
        };
        assertEquals(2, ro.orangesRotting(array4));

        int[][] array5 = {
            {2, 1, 1, 0},
            {0, 1, 2, 0},
            {1, 0, 1, 1},
            {1, 1, 0, 0}
        };
        assertEquals(-1, ro.orangesRotting(array5));

        int[][] array6 = null ;
        assertEquals(0, ro.orangesRotting(array6));
    }
}
