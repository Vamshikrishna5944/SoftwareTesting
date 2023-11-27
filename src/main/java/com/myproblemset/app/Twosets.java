package com.myproblemset.app;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Twosets {
    public static String[] solution(int n) {
       int prod = (n * (n + 1)) / 2;
        if (prod % 2 != 0){
            String [] answer= new String[1];
            answer[0] = "NO";
            return answer;
        }
            
        else {
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            int i;
            int j = n;
            if (n % 2 == 0) {
                i = 1;
            } else {
                set1.add(1);
                set1.add(2);
                set2.add(3);
                i = 4;
            }
            while (i <= j) {
                set1.add(i);
                ++i;
                set2.add(i);
                ++i;
                set1.add(j);
                --j;
                set2.add(j);
                --j;
            }
            String [] answer= new String[5];
            answer[0] = "YES";
            if(set1.size() > set2.size()){
                answer[1] = ""+set1.size();
                StringBuilder str1 = new StringBuilder();
                for (int x : set1)
                    str1.append(x).append(" ");
                answer[2] = str1.toString();
                answer[3] = ""+set2.size();
                StringBuilder str2 = new StringBuilder();
                for (int x : set2)
                    str2.append(x).append(" ");
                answer[4]=str2.toString();
            }
            else{
                answer[1] = ""+set2.size();
                StringBuilder str1 = new StringBuilder();
                for (int x : set2)
                    str1.append(x).append(" ");
                answer[2] = str1.toString();
                answer[3] = ""+set1.size();
                StringBuilder str2 = new StringBuilder();
                for (int x : set1)
                    str2.append(x).append(" ");
                answer[4]=str2.toString();
            }
            return answer;
        }   
    
    }
}
