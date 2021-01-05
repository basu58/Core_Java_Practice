package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Basudev
 *
 */
public class Example{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Get path of file
		Path filePath=Paths.get("C:/Users/basud/OneDrive/Desktop", "abc.txt");
		String[] arr=null;
		//using Stream get all lines of file 
		try (Stream<String> lines = Files.lines( filePath )) 
		{
			//convert Stream<String> into array
			arr=lines.toArray(String[]::new);
			
		}//try 

		catch (IOException e) 
		{
			e.printStackTrace();
		}//try
		
		List<String> l=new ArrayList<>();
		l.add("SPACE");
		//count occurrence of repeat letters
		for(int i=0; i<arr.length; i++) {
			String[] s1=arr[i].split(" ");
			int O=0, F=0, S=0, V=0, T=0;
			for(int j=0; j<s1[1].length(); j++) {
				if(s1[1].charAt(j)=='O') {
					O++;
				}
				if(s1[1].charAt(j)=='F') {
					F++;
				}
				if(s1[1].charAt(j)=='S') {
					S++;
				}
				if(s1[1].charAt(j)=='V') {
					V++;
				}
				if(s1[1].charAt(j)=='T') {
					T++;
				}
			}//for
			
			//according to occurrence of letter store value to list
			if(O>=2) {
				if(s1[1].contains("R") && s1[1].contains("O") 
						&& s1[1].contains("Z") &&s1[1].contains("O") )
					l.add("AIR");
			}
			
			
			if(F>=2) {
				if(s1[1].contains("U") && s1[1].contains("F") 
						&& s1[1].contains("S") &&s1[1].contains("I")  
						&& s1[1].contains("F"))
					l.add("LAND");
			}
			
			
			if(S>=2) {
				if(s1[1].contains("N") && s1[1].contains("V") 
						&& s1[1].contains("Y") &&s1[1].contains("P")  
						&& s1[1].contains("S") && s1[1].contains("H"))
					l.add("SPACE");
			}
			
			
			if(V>=2) {
				if(s1[1].contains("V") && s1[1].contains("J") 
						&& s1[1].contains("A") &&s1[1].contains("W")  
						&& s1[1].contains("B") && s1[1].contains("Z"))
					l.add("WATER");
			}
			
			
			if(T>=3) {
				if(s1[1].contains("T") && s1[1].contains("H") 
						&& s1[1].contains("V") &&s1[1].contains("A")  
						&& s1[1].contains("O"))
					l.add("ICE");
			}
			
			
			if(s1[1].contains("J") && s1[1].contains("X") 
					&& s1[1].contains("G") &&s1[1].contains("M")  
					&& s1[1].contains("U") && s1[1].contains("T"))
				l.add("FIRE");
			
		}//for
		
		//if list contains equals to 4 elements then it will print the message
		if(l.size()==4) {
			for(int i=0; i<l.size(); i++) {
				System.out.print(l.get(i)+" ");
			}
		}
		//else print NONE
		else
			System.out.println("NONE");
		

	}//main
}//class