package com.basu.n;

import java.util.*; 
import java.io.*;
import java.lang.Math;

public class Exercise38 {

  public static String NumberSearch(String str) {
    // code goes here  
    char[] ch=str.toCharArray();
    int letters=0;
    int numbers=0;
    int a=0;
    for(int i=0; i<str.length(); i++){
      if(Character.isLetter(ch[i]))
        letters++;
      else if(Character.isDigit(ch[i]))
    	  a=Integer.parseInt(Character.toString(ch[i])); 
        numbers=numbers+a;
    }
    System.out.println((numbers)/2+" "+letters);
    double d=numbers/letters;
    System.out.println(d);
    int total=(int)Math.round(d);
    System.out.println(total);
    str=Integer.toString(total);

    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(NumberSearch(s.nextLine())); 
  }

}