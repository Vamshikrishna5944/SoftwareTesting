package com.myproblemset.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Parse_boolean_Test {

    @Test
	public void testChange() {
		Parse_boolean ccs = new Parse_boolean(); 
		
		// Test 1
        
        String  expression = "&(|(f))";
        assertEquals(false,ccs.Solution(expression));

        String  expression1 = "|(f,f,f,t)";
        assertEquals(true,ccs.Solution(expression1));

        String  expression2 = "!(&(f,t))";
        assertEquals(true,ccs.Solution(expression2));

        


    }
    
}

    

