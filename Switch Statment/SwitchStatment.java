package switchStatements;
import java.util.Scanner;

public class SwitchStatment {
	public static void main (String args[]){
	int age;
	Scanner input = new Scanner(System.in);
	
	System.out.print("How old is your child?: ");
	
	age = input.nextInt();
	
	switch (age){
	case 1:
		System.out.print("You can crawl");
		break;
	case 2: System.out.print("You can talk");
		break;
	case 3: System.out.print("You can walk");
		break;
	default: System.out.print("I don't know how old you are");
		break;

	}
	
	input.close();
}

}