package com.myproblemset.app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class nextsmaller {
    
    public static int[] immediateSmaller(int []a)
    {
        int n = a.length;
       
        Stack<Integer> s = new Stack<>();
        s.add(a[0]);

        for (int i = 1; i < a.length; i++)
        {
            
            if (s.peek() > a[i])
            {
                a[i - 1] = a[i];
            }
            else
            {
                a[i - 1] = -1;
            }
              
            s.add(a[i]);
        }

        a[n - 1] = -1;
        return a ;
    }
}
