package com.quickride.test;

import java.util.Scanner;

public class GreaterPrime {
	public static int maxCheck;
	public static int[] arr;


    public static void main(String[] args) {

        int i;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        maxCheck = sc.nextInt(); 
        arr=new int[maxCheck];
        boolean isPrime = true;

       
        //Start loop 1 to maxCheck
        for (i = 1; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                for(int a=0; a<maxCheck; a++) {
                	arr[a]=i;
                }
            }
        }
        System.out.println(largest());
    }
    static int largest() 
    { 
        int i; 
          
        // Initialize maximum element 
        int max = arr[0]; 
       
        // Traverse array elements from second and 
        // compare every element with current max   
        for (i = 1; i < arr.length; i++) 
            if (arr[i] > max) 
                max = arr[i]; 
       
        return max; 
    } 
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }

}
