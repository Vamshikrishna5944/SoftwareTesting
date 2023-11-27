package com.myproblemset.app;
import static org.junit.jupiter.api.Assertions.assertAll;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class TwosetsTest {
    @Test
	public void testChange() {
		Twosets ccs = new Twosets(); 
		
		// Test 1
		int n =3;
        String [] answer= {"YES","2","1 2 ","1","3 "};
        assertEquals(answer, ccs.solution(n));

		
		// Test 2
		int n1 =2;
        String [] answer1= {"NO"};
        assertEquals(answer1, ccs.solution(n1));

		// Test 3
		int n2 =5;
        String [] answer2= {"NO"};
        assertEquals(answer2, ccs.solution(n2));

        int n3 =4;
        String [] answer3= {"YES","2","2 3 ","2","1 4 "};
        assertEquals(answer3, ccs.solution(n3));



	}
    
}
