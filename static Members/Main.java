
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		soda member1 = new soda("Megan", "Fox");
		soda member2 = new soda("Natalie", "Portman");
		soda member3 = new soda("Taylor", "Swift");

		System.out.println(soda.getMembers()); // static member use the class
												// name then the static method
												// to access a static member

		// System.out.println(member2.getfirstName());
		// System.out.println(member2.getLastName());
		// System.out.println(member2.getMembers());

	}

}
