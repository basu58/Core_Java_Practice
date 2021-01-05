package com.nt.inheritance.project;

import java.util.Scanner;

public class Pereson {
	Scanner sc=new Scanner(System.in);
	private String name;
	private int age;
	
	public void setPersonInfo()
	{
		System.out.print("enter name");
		name=sc.nextLine();
		System.out.print("enter age :: ");
		age=sc.nextInt(); 
	}
	
	public void getPersonInfo()
	{
		System.out.println("name :: "+name);
		System.out.println("age :: "+age);
	}
	
	

}
