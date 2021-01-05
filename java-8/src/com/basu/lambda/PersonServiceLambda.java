package com.basu.lambda;

import java.util.Collections;
import java.util.List;

public class PersonServiceLambda {
	public static List<Person> getPersons(List<Person> persons){
		Collections.sort(persons, (p1, p2)->p1.getName().compareTo(p2.getName()));
		return persons;
	}
}
