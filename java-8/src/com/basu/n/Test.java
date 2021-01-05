import java.util.*; 
import java.io.*;

class Main {

  public static void WordSplit(String[] strArr) {
    // code goes here  
    try{
	  String s1=strArr[0], s2=strArr[1];
	  int len=s1.length();
	  String[] arr=s2.split(",");
	  
	 
	  String[] arr2=s1.split("");
	  List<String> list=new ArrayList<>();
	  
	       for (int i = 0; i < s1.length(); i++) {
	           for (int j = i+1; j <= s1.length(); j++) {
	                list.add(s1.substring(i, j));
	           }
	       }
	      
	  List<String> list1=new ArrayList<String>();
	  
	  for(int i=0; i<arr.length; i++) {
		  for(int j=0; j<list.size(); j++) {
			  if(list.get(j).equals(arr[i])) {
				  list1.add(arr[i]);
			  }
		  }
	  }
	  
	  String e=s1.substring(0,4);
	  String e2=s1.substring(4, s1.length());
		
	  
	  
	  List<String> l=new ArrayList<>();
	  
      for(int i=0; i<list1.size(); i++) {
        
        if(list1.get(i).equals(e)) {
          l.add(e);
        }
        else if(list1.get(i).equals(e2)) {
          l.add(e2);
        }
        
      }
    System.out.println(l.get(1)+","+l.get(0));
    }catch(Exception e){
    System.out.println("not possible");
  }    
  }
  


  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    WordSplit(s.nextLine()); 
  }

}