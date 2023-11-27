package com.myproblemset.app;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Appartment {
    public static long answer(int [] applic,int [] appart,int m,int n,int k) {
        PriorityQueue<Integer> applicants = new PriorityQueue<>();
        PriorityQueue<Integer> apartments = new PriorityQueue<>();
        for (int i = 0; i < m; ++i) {
            applicants.add(applic[i]);
        }
        for (int i = 0; i < n; ++i) {
            apartments.add(appart[i]);
        }
        int ans = 0;
        while (!apartments.isEmpty() && !applicants.isEmpty()) {
            int nextApplicant = applicants.peek();
            int nextApartment = apartments.peek();
            if (Math.abs(nextApartment - nextApplicant) <= k) {
                ans++;
                apartments.poll();
                applicants.poll();
            } else if (nextApartment < nextApplicant)
                apartments.poll();
            else
                applicants.poll();
        }
        return ans;
    }
}
