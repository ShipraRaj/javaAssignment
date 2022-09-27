package package1;
import java.util.Scanner;


public class TwoDArray {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter the no of rows");
int r=sc.nextInt();
System.out.println("Enter the no of columns");
int c=sc.nextInt();
	int arr[][]=new int[r][c];
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			 arr[i][j]=sc.nextInt();
		}
	}
	
	int sumr=0;
	int sumc=0;
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			sumr = sumr + arr[i][j];
		}
		System.out.println("Sum of row "+i+"  - "+sumr);
		sumr=0;
	}

	System.out.println();
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			sumc = sumc + arr[j][i]; 
		}
		System.out.println("Sum of columns " +i+" -  "+ sumc);
		sumc=0;
	}

	
}
}
