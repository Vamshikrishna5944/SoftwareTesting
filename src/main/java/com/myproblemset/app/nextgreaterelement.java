package com.myproblemset.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class nextgreaterelement {
    

    public static int[] nextGreaterElement(int[] arr, int n) 
    {
        
        int[] ans = new int[n];

        for(int i = 0; i < n; i++)
        {
            ans[i] = -1;
        }

        for(int i = 0; i < n; i++)
        {
        
            for(int j = i + 1; j < n; j++)
            {
                if(arr[j] > arr[i])
                {
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }
}
