package com.BBI;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


/**
 * @author Basudev
 *
 */
public class Epoch2{
	public static void main(String args[]){
		//calling function 
		solution();
	}//main end
	//called function

	/**
	 * 
	 */
	public static void solution() {
		Scanner sc=new Scanner(System.in);
		//taking input of date in string format
		String input=sc.nextLine();
		String strDate=input+" 00:00:00 UTC";

		try {
			//if format 1 don't make any exception then print the epoch value in 1st format
			DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss zzz");
			ZonedDateTime     zdt  = ZonedDateTime.parse(strDate,dtf);
			System.out.println((zdt.toInstant().toEpochMilli())/1000); 
			//format 2
			DateTimeFormatter dtf1  = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss zzz");
			ZonedDateTime     zdt1  = ZonedDateTime.parse(strDate,dtf1);
			System.out.println((zdt1.toInstant().toEpochMilli())/1000); 
		}//try

		catch(DateTimeParseException e) {
			try {
				//format 3

				DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss zzz");
				ZonedDateTime     zdt  = ZonedDateTime.parse(strDate,dtf);
				System.out.println((zdt.toInstant().toEpochMilli())/1000); 
				//format 4
				DateTimeFormatter dtf1  = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss zzz");
				ZonedDateTime     zdt1  = ZonedDateTime.parse(strDate,dtf1);
				System.out.println((zdt1.toInstant().toEpochMilli())/1000); 
			}//try
			catch(DateTimeParseException e2) {
				try {
					//format 5
					DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss zzz");
					ZonedDateTime     zdt  = ZonedDateTime.parse(strDate,dtf);
					System.out.println((zdt.toInstant().toEpochMilli())/1000); 
					//format 6
					DateTimeFormatter dtf1  = DateTimeFormatter.ofPattern("MM.dd.yyyy HH:mm:ss zzz");
					ZonedDateTime     zdt1  = ZonedDateTime.parse(strDate,dtf1);
					System.out.println((zdt1.toInstant().toEpochMilli())/1000); 
				}//try
				catch(DateTimeParseException e4) {
					try {
						//format 7
						DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("ddMMyyyy HH:mm:ss zzz");
						ZonedDateTime     zdt  = ZonedDateTime.parse(strDate,dtf);
						System.out.println((zdt.toInstant().toEpochMilli())/1000); 
						DateTimeFormatter dtf1  = DateTimeFormatter.ofPattern("MMddyyyy HH:mm:ss zzz");
						ZonedDateTime     zdt1  = ZonedDateTime.parse(strDate,dtf1);
						System.out.println((zdt1.toInstant().toEpochMilli())/1000); 
					}//try
					catch(DateTimeParseException e6) {
						//If any format not satisfy our given formats then it will print error message
						System.out.println("Unable to convert the provided date");
					}//catch

				}//catch
				sc.close();
			}//solution() end
		}//class end
	}
}//class