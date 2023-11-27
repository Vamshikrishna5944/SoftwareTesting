package com.myproblemset.app;
import java.util.*;
import org.junit.Test;
import org.junit.Rule;
import static org.junit.Assert.*;
public class SolutionTest {

    @Test
    public void testRepeatedStringMatch() {
        frequent solution = new frequent();

        // Test case 1
        String a1 = "abcd";
        String b1 = "cdabcdab";
        assertEquals(3, solution.repeatedStringMatch(a1, b1));

        // Test case 2
        String a2 = "abc";
        String b2 = "cabcabca";
        assertEquals(4, solution.repeatedStringMatch(a2, b2));

        // Test case 3
        String a3 = "abc";
        String b3 = "abca";
        assertEquals(2, solution.repeatedStringMatch(a3, b3));

        // Test case 4
        String a4 = "abc";
        String b4 = "def";
        assertEquals(-1, solution.repeatedStringMatch(a4, b4));
        // Test case 5 - Mutation in the middle
        String a5 = "abc";
        String b5 = "adc";
        assertEquals(-1, solution.repeatedStringMatch(a5, b5));

        // Test case 6 - Mutation at the end
        String a6 = "abc";
        String b6 = "abd";
        assertEquals(-1, solution.repeatedStringMatch(a6, b6));

        // Test case 7 - Mutation in the repeated part
        String a7 = "abc";
        String b7 = "cabcabd";
        assertEquals(-1, solution.repeatedStringMatch(a7, b7));

        assertTrue(solution.KMP("ababcababcabcabc", "abcabc"));
        assertFalse(solution.KMP("ababcababcabcabc", "xyz"));
        String s1 = "ababcab";
        int[] lps1 = new int[s1.length()];
        solution.fillLPS(s1, lps1);
        assertArrayEquals(new int[]{0, 0, 1, 2, 0, 1, 2}, lps1);
        // Test case 2: String with repeating pattern
        String s2 = "ababab";
        int[] lps2 = new int[s2.length()];
        solution.fillLPS(s2, lps2);
        assertArrayEquals(new int[]{0, 0, 1, 2, 3, 4}, lps2);
    }
}
