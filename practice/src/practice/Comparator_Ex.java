package practice;
//Java program to demonstrate working of Comparator 
//interface more than one field 

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Iterator; 
import java.util.List; 
import java.util.Comparator; 

public class Comparator_Ex { 

	// instance member variables 
	String Name; 
	int Age; 

	// parameterized constructor 
	public Comparator_Ex(String Name, Integer Age) { 
		this.Name = Name; 
		this.Age = Age; 
	} 

	public String getName() { 
		return Name; 
	} 

	public void setName(String Name) { 
		this.Name = Name; 
	} 

	public Integer getAge() { 
		return Age; 
	} 

	public void setAge(Integer Age) { 
		this.Age = Age; 
	} 

	// overriding toString() method 
	@Override
	public String toString() { 
		return "Customer{" + "Name=" + Name + ", Age=" + Age + '}'; 
	} 

	static class CustomerSortingComparator implements Comparator<Comparator_Ex> { 

		@Override
		public int compare(Comparator_Ex customer1, Comparator_Ex customer2) { 

			// for comparison 
			int NameCompare = customer1.getName().compareTo(customer2.getName()); 
			int AgeCompare = customer1.getAge().compareTo(customer2.getAge()); 

			// 2-level comparison using if-else block 
			if (NameCompare == 0) { 
				return ((AgeCompare == 0) ? NameCompare : AgeCompare); 
			} else { 
				return NameCompare; 
			} 
		} 
	} 

	public static void main(String[] args) { 

		// create ArrayList to store Student 
		List<Comparator_Ex> al = new ArrayList<>(); 

		// create customer objects using constructor initialization 
		Comparator_Ex obj1 = new Comparator_Ex("Ajay", 27); 
		Comparator_Ex obj2 = new Comparator_Ex("Sneha", 23); 
		Comparator_Ex obj3 = new Comparator_Ex("Simran", 37); 
		Comparator_Ex obj4 = new Comparator_Ex("Ajay", 22); 
		Comparator_Ex obj5 = new Comparator_Ex("Ajay", 29); 
		Comparator_Ex obj6 = new Comparator_Ex("Sneha", 22); 

		// add customer objects to ArrayList 
		al.add(obj1); 
		al.add(obj2); 
		al.add(obj3); 
		al.add(obj4); 
		al.add(obj5); 
		al.add(obj6); 

		// before Sorting arraylist: iterate using Iterator 
		Iterator<Comparator_Ex> custIterator = al.iterator(); 

		System.out.println("Before Sorting:\n"); 
		while (custIterator.hasNext()) { 
			System.out.println(custIterator.next()); 
		} 

		// sorting using Collections.sort(al, comparator); 
		Collections.sort(al, new CustomerSortingComparator()); 

		// after Sorting arraylist: iterate using enhanced for-loop 
		System.out.println("\n\nAfter Sorting:\n"); 
		for (Comparator_Ex customer : al) { 
			System.out.println(customer); 
		} 
	} 
} 
