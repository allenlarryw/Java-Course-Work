
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Drinks object[] = new Drinks[2];
		
	object[0] = new soda();
	object[1] = new juice();
	   
	
	   for (int x=0; x <object.length; ++x){
		   
		   object[x].eat();
	   }
		 
		 //////  passing objects into methods
	    
	   person newObject = new person();  // person class
	   
	   
		
		
		Drinks dr = new soda();  // soda object which is a drink object using Drinks abstract class
		
		
		newObject.digest(dr);  // method
		
	}

}
