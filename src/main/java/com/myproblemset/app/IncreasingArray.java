package com.myproblemset.app;

public class IncreasingArray {
    public static long answer(int [] arr,int n) {
        long cnt = 0;
        for (int i = 1; i < n; ++i) {
            if (arr[i] < arr[i - 1]) {
                cnt += arr[i - 1] - arr[i];
                arr[i] = arr[i - 1];
            }
        }
        return cnt;
    }
}