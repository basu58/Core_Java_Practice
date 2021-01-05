package com.basu;

import java.util.Scanner;

public class Main {

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
		System.out.println(operation(arr)); 
		sc.close();
	}

	private static int operation(int[] arr) {
		int maxVal=0;
		
		for (int x = 0; x < arr.length-1; x++) { 
			for (int y = x+1; y < arr.length; y++) { 
				maxVal=Math.max((arr[x] % arr[y]), (arr[y] % arr[x]));
			}//inner for
		}//outer for
		return maxVal;
	}//main
}//class
