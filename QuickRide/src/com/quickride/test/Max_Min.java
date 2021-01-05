package com.quickride.test;

public class Max_Min {

	public static void main(String[] args) {
		int[] arr= {-1, -2, -5, -6, -8, -1, -5, -15, -5, -9, 0};
		solution(arr);
	}
	
	public static void solution(int[] arr) {
		int max=0;
		int min=1;
		int temp=0;
		int count=0;
		String s="";
		int size=arr.length;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(arr[i]<arr[j+1]) {
					temp=arr[j+1];
					for(int k=j+1; k<size; k++) {
						if(arr[i]<arr[j+1]) {
							
						}
					}
				}
			}
		}
		System.out.println(max+" "+min);
	}

}
