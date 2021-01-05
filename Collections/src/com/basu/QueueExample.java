package com.basu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {
	public static Queue<Integer> q;
	public static void printRevrerseQueue() {
		System.out.println(q);
	}
	public static void reverseQueue() {
		Stack<Integer> s=new Stack<Integer>();
		while(!q.isEmpty()) {
			s.add(q.peek());
			q.remove();
		}
		while(!s.isEmpty()) {
			q.add(s.peek());
			s.pop();
		}
	}


	public static void main(String[] args) {
		q=new LinkedList<Integer>();

		for(int i=50; i>=1; i--) {
			q.add(i);
		}
		System.out.println(q);
		int i=q.remove();
		System.out.println("remove():"+i);

		System.out.println("Peek():"+q.peek());
		System.out.println("poll():"+q.poll());

		System.out.println("element():"+q.element());

		System.out.println(q.size());
		q.add(null);

		System.out.println(q);
		
		reverseQueue();
		printRevrerseQueue();
		
		q.clear();
		System.out.println(q);

	}

}
