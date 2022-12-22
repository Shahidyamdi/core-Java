package inheritances;



public class solution  {
	    public static void main(String []args){
	        // Create a new Adder object
	        Adder a = new Adder();
	        
	        // Print the name of the superclass on a new line
	        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
	        
	        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
	       System.out.println(a.add(10, 32));
	       System.out.println(a.add(10, 3));
	       System.out.println(a.add(10, 10));
	     }

}



