package com.myproblemset.app;

public class Palindrome {

    public static String solution(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); ++i) {
            freq[str.charAt(i) - 'A']++;
        }
        int cnt = 0;
        char marker = 'A';
        for (int i = 0; i < freq.length; ++i) {
            if (freq[i] % 2 != 0) {
                cnt++;
                marker = (char) (i + 'A');
            }
        }
        if (cnt > 1)
            return "NO SOLUTION";
        else {
            StringBuilder stringBuilder_centre = new StringBuilder();
            StringBuilder stringBuilder_rev = new StringBuilder();
            StringBuilder stringBuilder_fwd = new StringBuilder();
            stringBuilder_centre.append(String.valueOf(marker).repeat(freq[marker - 'A']));
            for (int i = 0; i < freq.length; ++i) {
                if (i != marker - 'A') {
                    int count = freq[i];
                    stringBuilder_rev.append(String.valueOf((char) (i + 'A')).repeat(Math.max(0, count / 2)));
                    stringBuilder_fwd.append(String.valueOf((char) (i + 'A')).repeat(Math.max(0, count / 2)));
                }
            }
            stringBuilder_rev.reverse();
            stringBuilder_rev.append(stringBuilder_centre).append(stringBuilder_fwd);
            String answer =  stringBuilder_rev.toString();
            return answer;
    }
    
}
}
