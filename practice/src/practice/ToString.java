package practice;

public class ToString {

	public static void main(String[] args) {
		S s= new S("Hello", "Basudev");
		System.out.println(s);
	}

}
class S{
	String s1,s2;
	@Override
	public String toString() {
		return this.s1+" "+this.s2;
	}
	public S(String s1, String s2) {
		this.s1=s1;
		this.s2=s2;
	}
}