package com.basu.readwritelock;
import java.util.*;


/**
 * Writer.java
 * This thread randomly read an element from a shared data structure
 * @author www.codejava.net
 */
public class Writer extends Thread {
    private ReadWriteList<Integer> sharedList;
 
    public Writer(ReadWriteList<Integer> sharedList) {
        this.sharedList = sharedList;
    }
 
    public void run() {
        Random random = new Random();
        int number = random.nextInt(100);
        sharedList.add(number);
 
        try {
        	System.out.println(getName() + " -> put: " + number);
            Thread.sleep(100);
           
        } catch (InterruptedException ie ) { ie.printStackTrace(); }
    }
}