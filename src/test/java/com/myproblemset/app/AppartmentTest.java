package com.myproblemset.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppartmentTest {
    @Test
	public void testChange() {
		Appartment ccs = new Appartment(); 
		
		// Test 1
		int appl1[] = {61,47,81,62};
		int appart1[] = {32,63,75};
        int k1 = 6;
		assertEquals(2, ccs.answer(appl1,appart1,appl1.length,appart1.length,k1));
		
		// Test 2
		int appl2[] = {51,43,64,78,89,34,45,62};
		int appart2[] = {52,46,49,64,79,88,56,55};
        int k2 = 0;
		assertEquals(1, ccs.answer(appl2,appart2,appl2.length,appart2.length,k2));
		
		// Test 3
		int appl3[] = {11,12,13,14,15,16,17,18,19};
		int appart3[] = {55,100,46,74,93,2350,256,89};
        int k3 = 9;
		assertEquals(0, ccs.answer(appl3,appart3,appl3.length,appart3.length,k3));

	}
    
}
