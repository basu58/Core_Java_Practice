package com.basu.wrapper;

public class PDT_WCO {

	public static void main(String[] args) {
		int i=5;
		Integer io1=new Integer(i);
		Integer io2=Integer.valueOf(i);
		System.out.println(io1+"  "+io2);
		System.out.println(io1==io2);
		System.out.println();
		
		byte b=6;
		Byte bo1=new Byte(b);
		Byte bo2=Byte.valueOf(b);
		System.out.println(bo1+"  "+bo2);
		System.out.println(bo1==bo2);
		System.out.println();
		
		char c='a';
		Character cho1=new Character(c);
		Character cho2=Character.valueOf(c);
		System.out.println(cho1+"  "+cho2);
		System.out.println(cho1==cho2);
		System.out.println();
		
		boolean b1=true;
		Boolean boo1=new Boolean(b1);
		Boolean boo2=Boolean.valueOf(b1);
		System.out.println(boo1+"  "+boo2);
		System.out.println(boo1==boo2);
		System.out.println();
		
		double d=10.5;
		Double do1=new Double(d);
		Double do2=Double.valueOf(d);
		System.out.println(do1+"  "+do2);
		System.out.println(do1==do2);
		System.out.println();
		
		float f=15.4f;
		Float fo1=new Float(f);
		Float fo2=Float.valueOf(f);
		System.out.println(fo1+"  "+fo2);
		System.out.println(fo1==fo2);
		System.out.println();
		
		short s=6;
		Short so1=new Short(s);
		Short so2=Short.valueOf(s);
		System.out.println(so1+"  "+so2);
		System.out.println(so1==so2);
		System.out.println();
		
		long l=12587964L;
		Long lo1=new Long(l);
		Long lo2=Long.valueOf(l);
		System.out.println(lo1+"  "+lo2);
		System.out.println(lo1==lo2);
		System.out.println();
		
		System.out.println("___________________________________________\n___________________________________");
		
		Byte b3=new Byte((byte)50);
		Character ch1=new Character((char)97);
		//Boolean bo= new Boolean((boolean)97);
		Float f1=new Float(45.6);
		Float f3=new Float(45.6f);
		//float f2=45.8;
		float f2=45.8f;
		Double d2=new Double(45.8);
		Double d3=new Double(45.8f);
		Double d4=new Double(45);
		Double d5=new Double('r');
		//Double d7=new Double("r");
		//System.out.println("d7="+d7);//java.lang.NumberFormatException
		Double d6=new Double(456L);
		System.out.println("d5 = "+d5);
		System.out.println("d6 = "+d6);
		System.out.println();
		
		Long l1=new Long(456789123L);
		//Long l2=new Long(45566874f);
		Long l2=new Long((long)45566874f);
		Long l3=(long)4556224f;
		Long l4=new Long('a');
		/*
		 * Long l5=new Long("a");// java.lang.NumberFormatException
		 * System.out.println("l5="+l5);// java.lang.NumberFormatException
		 */		
		//Long l6=new Long(true);
		int x=new Integer(5);
		System.out.println(x);
		
		
	}

}
