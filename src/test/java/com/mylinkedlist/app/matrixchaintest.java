package com.mylinkedlist.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class matrixchaintest 
{
    
     @Test
	public void testChange() 
    {

        matrixchain mc = new matrixchain();

        int[] array1  = {4, 5, 3 ,2};
        assertEquals(70,mc.matrixMultiplication(array1, 4));

        int[] array2 = {10, 20, 30, 40, 50};
        assertEquals(38000,mc.matrixMultiplication(array2, 5));
        
    }
    
}
