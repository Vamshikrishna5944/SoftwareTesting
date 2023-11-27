package com.myproblemset.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Rule;

import org.junit.contrib.java.lang.system.SystemOutRule;



public class CoinChangeSourceTest {

	@Test
	public void testChange() {
		IncreasingArray ccs = new IncreasingArray(); 
		
		// Test 1
	
		int[] coins1 = {3,2,5,1,7};
		int amount1 = 5;
		assertEquals(5, ccs.answer(coins1, amount1));
		
		// Test 2
		int coins2[] = {1,1,1,1,1,1,1,1,1,1};
		int amount2 = 10;
		assertEquals(0, ccs.answer(coins2, amount2));
		
		// Test 3
		int coins3[] = {6,10,4,10,2,8,9,2,7,7};
		int amount3 = 10; 
		assertEquals(31, ccs.answer(coins3, amount3));

		int coins4[] = {6,6,6,6,6};
		int amount4 = 5; 
		assertEquals(0, ccs.answer(coins3, amount3));




	}
	
	
}