package com.myproblemset.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class longestsequencetest 
{
    
    @Test
	public void testChange()
    {
        llongestsequence ls  = new llongestsequence();
        String s11 = "adebc" ;
        String s12  = "dcadb" ;
        assertEquals(3,ls.lcs(s11,s12));

        String s21 = "def";
        String s22 = "fed";
        assertEquals(1,ls.lcs(s21,s22));

        String s31 = "abcdb";
        String s32 = "bcacdhb";
        assertEquals(4, ls.lcs(s31,s32));

        String s41 = "abc";
        String s42 = "def" ;
        assertEquals(0, ls.lcs(s41,s42));
    }
}