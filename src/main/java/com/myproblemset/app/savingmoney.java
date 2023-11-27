package com.myproblemset.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class savingmoney 
{
    public static int savingMoney(int n, int source, int destination, int k, List<List<Integer>> trains) 
    {
        int high = (int) 1e9;

        List<List<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < k + 2; i++) 
        {
            dp.add(new ArrayList<>());
            for (int j = 0; j < n + 1; j++) 
            {
                dp.get(i).add(high);
            }
        }

        dp.get(0).set(source, 0);

        for (int i = 1; i < k + 2; i++) 
        {
            dp.get(i).set(source, 0);

            for (int j = 0; j < trains.size(); j++) 
            {
                int a = trains.get(j).get(0), b = trains.get(j).get(1), c = trains.get(j).get(2);
                dp.get(i).set(b, Math.min(dp.get(i).get(b), dp.get(i - 1).get(a) + c));
            }

        }

        if (dp.get(k + 1).get(destination) >= high) 
        {
            return -1;
        }

        return dp.get(k + 1).get(destination);
    }
}
