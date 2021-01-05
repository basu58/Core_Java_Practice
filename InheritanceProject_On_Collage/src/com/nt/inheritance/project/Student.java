package com.nt.inheritance.project;

import java.util.Scanner;

public class Student extends Pereson {
	Scanner sc=new Scanner(System.in);
	private int sno;
	private String course;
	private double fee;
	
	public void setStudentInfo()
	{
		setPersonInfo();
		System.out.print("enter Student number :: ");
		sno=sc.nextInt(); sc.nextLine();
		System.out.print("eenter Student course :: ");
		course=sc.nextLine();
		System.out.print("enter student courdse fee :: ");
        fee=sc.nextDouble();
        
	}
	public void getStudentInfo()
	{
		getPersonInfo();
		System.out.println("student :: "+sno);
		System.out.println("student course ::"+course);
		System.out.println("student fee ::"+fee);
		
	}

}
