package com.basu.wrapper;

public class WCO_PDT {

	public static void main(String[] args) {
		Integer io1=Integer.valueOf(15);
		int x=io1.intValue();
		int y=io1.hashCode();
		int z=io1.compareTo(254);
		float f=io1.floatValue();
		System.out.println("f= "+f);
		byte b=io1.byteValue();
		Short s=io1.shortValue();
		short s1=io1.shortValue();
		
		//char c2=io1.charValue();//The method charValue() is undefined for the type Integer
		char c=(char)io1.byteValue();
		char c1=(char)io1.intValue();
		
		//boolean b1=(boolean)io1.intValue();
		
		System.out.println("c1= "+c1);
		System.out.println("s= "+s+" s1="+s1);
		System.out.println("b= "+b);
		System.out.println(x+"  "+y+"  "+z);
		
		System.out.println("___________________\n___________________");
		System.out.println("___________________\n___________________");
		
		Float io2=Float.valueOf(15);
		int x1=io2.intValue();
		int y1=io2.hashCode();
		int z1=io2.compareTo(25.6f);
		float f1=io2.floatValue();
		System.out.println("f= "+f1);
		byte b1=io2.byteValue();
		Short s2=io2.shortValue();
		short s3=io2.shortValue();
		
		//char c2=io1.charValue();//The method charValue() is undefined for the type Integer
		char c2=(char)io2.byteValue();
		char c3=(char)io2.intValue();
		
		//boolean b1=(boolean)io1.intValue();
		
		System.out.println("c2= "+c2+" c3="+c3);
		System.out.println("s2= "+s2+" s3="+s3);
		System.out.println("b= "+b1);
		System.out.println(x1+"  "+y1+"  "+z1);
		
		System.out.println("___________________\n___________________");
		System.out.println("___________________\n___________________");
		
		Byte b4=Byte.valueOf((byte)25);
		System.out.println("b4 = "+b4);

	}

}
