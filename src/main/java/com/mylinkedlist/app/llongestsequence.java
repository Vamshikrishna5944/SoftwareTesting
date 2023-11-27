package com.mylinkedlist.app;
import java.util.Arrays;

public class llongestsequence 
{
    public static int lcs(String str1, String str2) {
        int[][] dp = new int[str1.length()][str2.length()];

        for (int i = 0; i < str1.length(); i++)
        {
            Arrays.fill(dp[i], -1);
        }

        return lcsHelper(str1, str1.length(), str2, str2.length(), dp);
    }

    private static int lcsHelper(String str1, int n, String str2, int m, int[][] dp) 
    {
        if (m == 0) 
        {
            return 0;
        }
        if (n == 0) 
        {
            return 0;
        }
        if (dp[n - 1][m - 1] != -1) 
        {
            return dp[n - 1][m - 1];
        }
        if (str1.charAt(n - 1) != str2.charAt(m - 1)) 
        {
           
            return dp[n - 1][m - 1] = Math.max(
                    lcsHelper(str1, n - 1, str2, m, dp),
                    lcsHelper(str1,  n, str2,m - 1, dp));
        } 
        else 
        {
           
            return dp[n - 1][m - 1] =
                    1 + lcsHelper(str1, n - 1, str2,  m - 1, dp);
        }
    }
}
    

