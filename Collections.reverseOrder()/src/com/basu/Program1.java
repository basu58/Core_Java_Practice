package com.basu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		
		al.add(55);
		al.add(85);
		al.add(67);
		al.add(82);
		al.add(97);
		al.add(82);
		al.add(97);
		Integer[] arr=al.toArray(new Integer[0]);
		System.out.println(al);
		//Collections.sort(al,Collections.reverseOrder());
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}
