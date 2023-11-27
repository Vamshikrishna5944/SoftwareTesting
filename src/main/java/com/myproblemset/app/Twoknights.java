package com.myproblemset.app;

import java.util.Scanner;

public class Twoknights {
    public static long[] solution(int n) {
        long sum = 0;
        long [] answer = new long[n];
        for (long i = 1; i <= n; ++i) {
            long square = i * i;
            long possibilities = ((square) * (square - 1)) / 2;
            int a, b;
            b = (int)i- 1;
            for (a = 0; a < i; ++a) {
                sum += countClashes(a, b);
            }
    
            a = (int)i - 1;
            for (b = 0; b < i - 1; ++b) {
                sum += countClashes(a, b);
            }
    
            if (i >= 3)
                sum += 2;
            answer[(int)i-1]=possibilities - sum;
        }
        return answer;
    }
    static long countClashes(int i, int j) {
        long sum = 0;
        if (i - 2 >= 0 && j - 1 >= 0)
            ++sum;
        if (j - 2 >= 0 && i - 1 >= 0)
            ++sum;
        if (i - 2 >= 0 && j + 1 < i)
            ++sum;
        if (j - 2 >= 0 && i + 1 < j)
            ++sum;
        if (i - 1 >= 0 && j + 2 < i)
            ++sum;
        if (j - 1 >= 0 && i + 2 < j)
            ++sum;
        return sum;
    }
}

    