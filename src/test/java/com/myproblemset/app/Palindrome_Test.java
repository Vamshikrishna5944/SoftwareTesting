package com.myproblemset.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Palindrome_Test {

     @Test
	public void testChange() {
		Palindrome ccs = new Palindrome(); 
		
		// Test 1
	   String str = "AAAACACBA";
        String ans = ccs.solution(str);
        StringBuilder rev = new StringBuilder();
        rev.append(ans);
        rev.reverse();
        assertEquals(rev.toString(), ans);

        String str1 = "CCCC";
        String ans1 = ccs.solution(str1);
        StringBuilder rev1 = new StringBuilder();
        rev1.append(ans1);
        rev1.reverse();
        assertEquals(rev1.toString(), ans1);

        String str2 = "CDCDCD";
        String ans2 = ccs.solution(str2);
        assertEquals("NO SOLUTION", ans2);

        String str3 = "C";
        String ans3 = ccs.solution(str3);
        assertEquals("C", ans3);

        String str4 = "CD";
        String ans4 = ccs.solution(str4);
        assertEquals("NO SOLUTION", ans4);

        String str5 = "CCDAAAD";
        String ans5 = "DCAAACD";
        assertEquals(ans5, ccs.solution(str5));



	}
    
}
