
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myClass object1 = new myClass();
		myClass object2 = new myClass(5);
		myClass object3 = new myClass(5, 13);
		myClass object4 = new myClass(5, 13, 43);

		System.out.printf("%s\n", object1.toMilitary());
		System.out.printf("%s\n", object2.toMilitary());
		System.out.printf("%s\n", object3.toMilitary());
		System.out.printf("%s\n", object4.toMilitary());

	}

}
