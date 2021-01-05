package com.basu;

public class CustomCollection1 {

	public static void main(String[] args) {
		Object[] obj=new Object[4];
		
		obj[0]=10;
		obj[1]='a';
		obj[2]=3;
		obj[3]="b";	
		for(int i=0; i<obj.length; i++) {
			System.out.print(obj[i]+"\t");
		}
		
		System.out.println();
		Object[] obj1=new Object[obj.length+1];
		int j=0;
		for(;j<obj.length; j++)
			obj1[j]=obj[j];
		obj1[j]=90;
		
		for(int i=0; i<obj1.length; i++) {
			System.out.print(obj1[i]+"\t");
		}
		
	}

}
