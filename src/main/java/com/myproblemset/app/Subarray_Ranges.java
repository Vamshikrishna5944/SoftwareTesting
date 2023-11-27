package com.myproblemset.app;
import java.util.*;

public class 	Subarray_Ranges {
	public static long solution(int[] nums) {
		int n = nums.length;
		long sum = 0;
		Deque<Integer> q = new ArrayDeque<>(); // store index

		q.add(-1);
		for (int i = 0; i <= n; i++) {
			while (q.peekLast() != -1 && (i == n || nums[q.peekLast()] <= nums[i])) {
				int cur = q.removeLast();
				int left = q.peekLast();
				int right = i;
				sum += 1L * (cur - left) * (right - cur) * nums[cur];
			}
			q.add(i);
		}

		q.add(-1);
		for (int i = 0; i <= n; i++) {
			while (q.peekLast() != -1 && (i == n || nums[q.peekLast()] >= nums[i])) {
				int cur = q.removeLast();
				int left = q.peekLast();
				int right = i;
				sum -= 1L * (cur - left) * (right - cur) * nums[cur];
			}
			q.add(i);
		}
		return sum;
	}
}
