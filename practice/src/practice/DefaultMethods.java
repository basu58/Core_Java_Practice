package practice;
interface A{
	public default void printSomething() {
		System.out.println("Inside the interface of A");
	}
}
interface B{
	public default void printSomething() {
		System.out.println("Inside the interface of B");
	}
}
public class DefaultMethods implements A,B {

	@Override
	public void printSomething() {
		// TODO Auto-generated method stub
		System.out.println("I'm inside class DefaultMethods.");
		
		A.super.printSomething();
		B.super.printSomething();
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	

}
