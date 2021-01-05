/*
package com.basu;

public class MaxPairProduct {

	// Naive solution to find maximum product of two integers // in an array
	public static void findMaximumProduct(int[] A) { 
		int max_product = 0; 
		int max_i = 0, max_j = 0;

		// consider every pair of elements 
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) { // update maximum product if required 
				if (max_product < A[i] * A[j]) { 
					max_product = A[i] * A[j]; 
					max_i =i; 
					max_j = j; 
				} 
			} 
		}

		System.out.print("Pair is (" + A[max_i] + ", " + A[max_j] + ")"); 
	}

	public static void main (String[] args) { 
		int[] A = { 1, 2, 3, 4, 5 };

		findMaximumProduct(A); 
	} 
}*/
package com.basu;

import java.util.Scanner;
public class MaxPairProduct { public static int operation(int[] arr) { int
	max=0; int i=0, j=0;

	for (int x = 0; x < arr.length-1; x++) { 
		for (int y = x+1; y < arr.length; y++) { 
			if(max < arr[x]*arr[y]) 
				max=arr[x]*arr[y]; 
			i=x; 
			j=y; 
			} 
		}

	System.out.println("Max product of two numbers are: "+arr[i]+" and "+arr[j]);

	return max; 
	} 
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter size of the array: "); 
			int size=sc.nextInt();

			int[] arr=new int[size]; for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt(); } for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+"\t"); 
					} 
				System.out.println(); operation(arr); 
	} 
}
