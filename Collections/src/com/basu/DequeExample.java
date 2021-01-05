package com.basu;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		Deque<String> d=new LinkedList<>();
		
		d.add("add() 1 to tail");
		d.addFirst("addFirst() 2 to head");
		d.addLast("addLast() 3 to tail");
		d.offer("offer() 4 to tail");
		d.offerFirst("offerFirst() 5 to head");
		d.offerLast("offerLast() 6 to tail");
		
		System.out.println("Deque="+d);
		
		Iterator<String> itr=d.iterator();
		while(itr.hasNext()) {
			System.out.println("Common iterator:"+itr.next());
		}
		System.out.println();
		Iterator<String> itr1=d.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println("Reverse iterator:"+itr1.next());
		}
		System.out.println();
		d.push("push(_) 7 to head");
		System.out.println("After push():"+d);
		System.out.println();
		
		System.out.println("pop():"+d.pop());
		System.out.println();
		
		d.remove();
		System.out.println("after remove():"+d);
		d.removeFirst();
		System.out.println("after removeFirst():"+d);
		d.removeLast();
		System.out.println("after removeLast():"+d);
		System.out.println();
		
		System.out.println("poll():"+d.poll());
		System.out.println("pollFirst():"+d.pollFirst());
		System.out.println("pollLast():"+d.pollLast());
		System.out.println();
		
		System.out.println("peek():"+d.peek());
		System.out.println("peekFirst():"+d.peekFirst());
		System.out.println("peekLast():"+d.peekLast());
		
		d.clear();
		System.out.println(d);
		int a=10;
		if(a<=0)
		{
		   if(a==0)
		   {
		     System.out.println("1 ");
		   }
		   else 
		   { 
		      System.out.println("2 ");
		   }
		}
		System.out.println("3 ");




	}

}
