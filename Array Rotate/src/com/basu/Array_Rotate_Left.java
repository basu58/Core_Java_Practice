package com.basu;

public class Array_Rotate_Left
{ 
	
	static void rotation(int arr[], int n, 
									int x) 
	{ 
		int a = x % n; 
		
		for(int i = 0; i < n; ++i) 
		System.out.print(arr[(i + a) % n] 
						+ " "); 
		System.out.println(); 
	} 
	public static void main (String[] args) 
	{ 
			int arr[] = { 1, 3, 5, 7, 9 }; 
			int n = arr.length; 
			int x = 3; 
			rotation(arr, n, x); 
	} 
} 

