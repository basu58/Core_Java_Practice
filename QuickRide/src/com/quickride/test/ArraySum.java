package com.quickride.test;


import java.io.*;
import java.util.HashSet;

public class ArraySum {
	static void printpairs(int arr[], int sum)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; ++i) 
		{
			int temp = sum - arr[i];

			
			if (s.contains(temp)) {
				System.out.println(
					""
					+ sum + " is (" + arr[i]
					+ ", " + temp + ")");
			}
			s.add(arr[i]);
		}
	}

	
	public static void main(String[] args)
	{
		int A[] = {0,1,2,7,3,4,5};
		int n = 5;
		printpairs(A, n);
	}
}

