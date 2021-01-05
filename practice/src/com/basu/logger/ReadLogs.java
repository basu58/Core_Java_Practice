package com.basu.logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class ReadLogs {

   public static void main(String args[]) throws FileNotFoundException{
       String line, logString ="";
       Date startDate, endDate;

       ArrayList<String> logList = new ArrayList<>();

       Scanner logScanner = new Scanner(new        File("D:\\work-spaces\\core_java\\practice\\Logging.txt"));
       while (logScanner.hasNextLine()) {
            line = logScanner.nextLine();
            logList.add(line);                  
        }

       for (String z : logList) {
//          System.out.println(z);
        }


      // This function prints out all lines containing a specific string

       for( int i = 0; i <= logList.size() - 1; i++)
       {
           logString = logList.get(i);
           if(logString.contains("16:04:22")){
               System.out.println("String Contains" +logString);
           }

       }
   }     
}