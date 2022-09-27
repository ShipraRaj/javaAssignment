package package1;

import java.util.Scanner;

public class mainClassNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("******* Menu*******");
		System.out.println("Choose an option(1-3):");
		int i=sc.nextInt();
		System.out.println("Enter radius");
		int r=sc.nextInt();
		switch(i) {
		case 1:
		{
			area(r);
			break;
			}
		case 2:
		{ 
			circumference(r);
			break;
			}
		case 3:
		{
			System.out.println("Exit");
			break;
			}
		default:
			System.out.println("Choose between 1 and 3");
			}
	}
	static void circumference(double radius) {
		System.out.println("Calculate Circumference of Circle");
		double circum= 2*3.14*radius;
		System.out.println(circum);
		}
	static void area(double r) {
		System.out.println("Calculate Area of Circle"); 
		double ar=3.14*r*r;
		System.out.println(ar);
		}

}
