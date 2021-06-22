package com.basu.hackerrank;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Person {
    private String name;
    private String age;
    private float salary;
 
    public Person() {
    }
 
    public String getName() {
        return name;
    }
 
    private void setName(String name) {
        this.name = name;
    }
 
    protected void setAge(String age) {
        this.age = age;
    }
 
    public float getSalary() {
        return salary;
    }
}
 
public class JavaReflectionAttributes {
    public static void main(String[] args) {
        Method[] methods = Person.class.getDeclaredMethods();
        ArrayList<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }
        
        /* Sort and print names */
        Collections.sort(methodNames);
        for (String name: methodNames) {
            System.out.println(name);
        }
    }
}