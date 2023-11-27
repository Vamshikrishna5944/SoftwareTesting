package com.myproblemset.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Rule;

import org.junit.contrib.java.lang.system.SystemOutRule;

public class nextsmallertest {
    

    @Test
	public void testChange() 
    {
        nextsmaller ns = new nextsmaller();
        int[] numbers6 = {5,5,5,5,5};
        int[] ans6 = {-1,-1,-1,-1,-1} ;
        assertArrayEquals(ans6, ns.immediateSmaller(numbers6));

        int[] numbers1 = {230, 901, 585, 514, 478, 411, 165, 769, 429, 738, 761, 147, 849, 98, 589, 655};
        int[] ans1 = {-1, 585, 514, 478, 411, 165, -1, 429, -1, -1, 147, -1, 98, -1, -1, -1};
        assertArrayEquals(ans1, ns.immediateSmaller(numbers1));

    }
}
