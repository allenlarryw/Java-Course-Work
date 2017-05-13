import java.util.*;
public class StackPushPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> newStack = new Stack<String>();
		
		newStack.push("bottom");
		printStack(newStack);
		newStack.push("second");
		printStack(newStack);
		newStack.push("third");
		printStack(newStack);
		
		newStack.pop();
		printStack(newStack);
		newStack.pop();
		printStack(newStack);
		newStack.pop();
		printStack(newStack);
		
		
	}

	private static void printStack(Stack<String> s) {
		// TODO Auto-generated method stub
		
		if(s.isEmpty())
			System.out.println("you have nothing in your stack");
		else
			System.out.printf("%s TOP\n", s);
		
	}

}
