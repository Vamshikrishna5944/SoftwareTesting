package com.myproblemset.app;

import java.util.*;


public class numberofislands
{
    
    static int row[] = { 0, -1, 0, 1 };
    static int col[] = { -1, 0, 1, 0 };

    private static String DFS(int[][] arr, int r, int c, StringBuilder s, char ch, int n, int m) 
    {
        arr[r][c] = 0;

        s.append(ch);

        char[] sDir = new char[] { 'l', 'u', 'r', 'd' };
        for (int i = 0; i < 4; i++) 
        {
        
            int nr = r + row[i];
            int nc = c + col[i];

        
            if (nr < 0 || nr >= n || nc < 0 || nc >= m || arr[nr][nc] == 0) 
            {
                continue;
            }

            DFS(arr, nr, nc, s, sDir[i], n, m);
            s.append('b'); 
            
        }

        return s.toString();
    }

    public static int distinctIsland(int[][] arr, int n, int m) 
    {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                if (arr[i][j] == 1) 
                {
                    StringBuilder s = new StringBuilder();
                    
                    set.add(DFS(arr, i, j, s, 's', n, m));
                }
            }
        }

        return set.size();
    } 
}
