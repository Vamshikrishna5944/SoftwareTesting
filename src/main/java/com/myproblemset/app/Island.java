package com.myproblemset.app;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Island {

    boolean isSafe(int M[][], int row, int col,boolean visited[][],int ROW,int COL)
	{
		return (row >= 0) && (row < ROW) && (col >= 0)&& (col < COL) && (M[row][col] == 1 && !visited[row][col]);
	}

	void DFS(int M[][], int row, int col,boolean visited[][],int ROW,int COL)
	{
		int rowNbr[]
			= new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colNbr[]
			= new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

		visited[row][col] = true;

		for (int k = 0; k < 8; ++k)
			if (isSafe(M, row + rowNbr[k], col + colNbr[k],visited,ROW,COL))
				DFS(M, row + rowNbr[k], col + colNbr[k],visited,ROW,COL);
	}

	int countIslands(int M[][])
	{
        int numRows = M.length;
        int numColumns = M[0].length;

		boolean visited[][] = new boolean[numRows][numColumns];
		int count = 0;
		for (int i = 0; i < numRows; ++i)
			for (int j = 0; j < numColumns; ++j)
				if (M[i][j] == 1
					&& !visited[i][j]) // If a cell with
				{ 
					DFS(M, i, j, visited,numRows,numColumns);
					++count;
				}

		return count;
	}

}


	