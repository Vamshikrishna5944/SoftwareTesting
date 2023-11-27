package com.myproblemset.app;

public class matrixchain 
{
    static int dp[][] = new int[102][102];

	public static int matrixMultiplication(int[] arr, int N) 
    {
	
		for (int i = 0; i < 102; i++) 
        {
			for (int j = 0; j < 102; j++)
             {
				dp[i][j] = -1;
			}
		}

		int ans = calculateCost(arr, 1, N - 1);

		return ans;
	}

	private static int calculateCost(int[] arr, int i, int j) 
    {

		if (i >= j) 
        {
			return 0;
		}

		if (dp[i][j] != -1) 
        {
			return dp[i][j];
		}

		int ans = Integer.MAX_VALUE;

		for (int k = i; k < j; k++) 
        {
			int temp = calculateCost(arr, i, k) + calculateCost(arr, k + 1, j) + (arr[k] * arr[i - 1] * arr[j]);

			ans = Math.min(ans, temp);
		}

		dp[i][j] = ans;

		return ans;
	}
}
