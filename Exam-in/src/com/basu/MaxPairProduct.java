package com.basu;

import java.util.Scanner;

public class MaxPairProduct {
	public static int operation(int[] arr) {
		int max=0;
		int i=0, j=0;
		
		for (int x = 0; x < arr.length-1; x++) {
			for (int y = x+1; y < arr.length; y++) {
				if(max < arr[x]*arr[y])
					max=arr[x]*arr[y];
				i=x;
				j=y;
			}
		}
		
		System.out.println("Max product of two numbers are: "+i+" and "+j);
		
		return max;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		operation(arr);
	}
}