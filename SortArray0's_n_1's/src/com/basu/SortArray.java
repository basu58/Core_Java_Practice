package com.basu;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args)
    {
        int arr[] = new int[]{ 0,1,0,1,1 };
        int result[];
        int n = arr.length;
        result = sort(arr, n);
        System.out.println(Arrays.toString(result));
      }
    
    static int [] sort(int arr[], int n)
     {
        int count = 0;   
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1)
                count++;
        }
        for (int i = 0; i < count; i++)
            arr[i] = 1;
        for (int i = count; i < n; i++)
            arr[i] = 0;
         return arr;
     }       
   }
