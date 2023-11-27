package com.myproblemset.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.Rule;

import org.junit.contrib.java.lang.system.SystemOutRule;


public class nextgreaterelementtest {
    

    @Test
    public void testChange() 
    {
        nextgreaterelement nge = new nextgreaterelement();
        int[] numbers1 = {10, 536, 729, 905, 861, 598, 327, 493, 934, 586, 118, 804, 770, 781, 349, 512, 728, 284, 277};
        int[] ans1 = {536, 729, 905, 934, 934, 934, 493, 934, -1, 804, 804, -1, 781, -1, 512, 728, -1, -1, -1};
        assertArrayEquals(ans1, nge.nextGreaterElement(numbers1,19));

        int[] numbers2 = {230, 901, 585, 514, 478, 411, 165, 769, 429, 738, 761, 147, 849, 98, 589, 655};
        int[] ans2 = {901, -1, 769, 769, 769, 769, 769, 849, 738, 761, 849, 849, -1, 589, 655, -1};
        assertArrayEquals(ans2, nge.nextGreaterElement(numbers2,16));

        int[] numbers3 = {435, 115, 399, 524, 641, 990, 331, 260, 648, 67, 178, 670, 667, 651, 231, 637};
        int[] ans3 = {524, 399, 524, 641, 990, -1, 648, 648, 670, 178, 670, -1, -1, -1, 637, -1};
        assertArrayEquals(ans3, nge.nextGreaterElement(numbers3,16));

        int[] numbers5 = {200};
        int[] ans5 = {-1};
        assertArrayEquals(ans5, nge.nextGreaterElement(numbers5,1));

        int[] numbers6 = {5,5,5,5,5};
        int[] ans6 = {-1,-1,-1,-1,-1} ;
        assertArrayEquals(ans6, nge.nextGreaterElement(numbers6,5));
    }
}
