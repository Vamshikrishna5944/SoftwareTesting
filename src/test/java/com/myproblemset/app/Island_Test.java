package com.myproblemset.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Island_Test {

    @Test
	public void testChange() {
		Island ccs = new Island(); 

        int M[][]= { { 1, 1, 0, 0, 0 },
                    { 0, 1, 0, 0, 1 },
                    { 1, 0, 0, 1, 1 },
                    { 0, 0, 0, 0, 0 },
                    { 1, 0, 1, 0, 1 } };
        assertEquals(5,ccs.countIslands(M));

	}
    
}
