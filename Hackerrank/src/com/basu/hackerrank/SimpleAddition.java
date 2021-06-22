package com.basu.hackerrank;
import java.io.*;
import java.util.*;

public class SimpleAddition {
	
	public static void addition(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == 1) {
				System.out.println(arr[i-1]+" + "+arr[i]+" = "+(arr[i]+arr[i-1]));
			}
			
			if(i == 2) {
				System.out.println(arr[i-2]+" + "+arr[i-1]+" + "+arr[i]+" = "+(arr[i]+arr[i-1]+arr[i-2]));
			}
			
			if(i == 4) {
				System.out.println(arr[i-4]+" + "+arr[i-3]+" + "+arr[i-2]
						+" + "+arr[i-1]+" + "+arr[i]+" = "+(arr[i]+arr[i-1]+arr[i-2]+arr[i-3]+arr[i-4]));
			}
			
			if(i == 5) {
				System.out.println(arr[i-5]+" + "+arr[i-4]+" + "+arr[i-3]+" + "+arr[i-2]
						+" + "+arr[i-1]+" + "+arr[i]+" = "+(arr[i]+arr[i-1]+arr[i-2]+arr[i-3]+arr[i-4]+arr[i-5]));
			}
			
		}
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        addition(arr);
    }
}