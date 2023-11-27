package com.myproblemset.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Rule;

import org.junit.contrib.java.lang.system.SystemOutRule;

public class getdiametertest 
{
    
    @Test
	public void testChange() 
    {
            getdiameter gd = new getdiameter();

            int[] array1 = {1, 2, 3,-1, -1, -1};
            assertEquals(2, gd.getnumber(array1));

            int[] array2  = {25, -1 ,-1};
            assertEquals(0, gd.getnumber(array2));

            // int[] array3 = {28, -1, 16, 20, -1, 15, -1, 19, -1, 13, -1, -1, 12, -1, 6, -1, -1};
            // assertEquals(7, gd.getnumber(array3));

            int[] array4 = {1, -1, 2, -1, -1};
            assertEquals(1, getdiameter.getnumber(array4));  
    }
}
