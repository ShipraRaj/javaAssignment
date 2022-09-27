package package1;

public class programStatic{
	//static variables
	static String Fname="alka";
	static String Lname="Singh";
	static int age1=21;
	//static block
	static {
		 String FirstName="Shipra";
		 String LastName="Raj";
		 int age=22;
		System.out.println(FirstName + " " +LastName + " " +age);
	}
	static void printFunction() {
		 String FirstName="Vivek";
		 String LastName="Gupta";
		 int age=23;
		System.out.println(FirstName + " " +LastName + " " +age);
	}
	

	public static void main(String[] args) {
		printFunction();
		System.out.println(Fname + " "+ Lname + " " + age1);
	}
}
