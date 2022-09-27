package package1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuProgram {

	public static void main(String[] args) {
		List<String> text= new ArrayList<>();
		System.out.println("Enter your text(when given XDONE exit)");
		Scanner sc=new Scanner(System.in);
				while(true) {
					String input=sc.nextLine();
					if("XDONE".equalsIgnoreCase(input)) {
						break;
					}
					text.add(input);
				}
		System.out.printf("User input\n %s",String.join("\n",text));

	}

}
