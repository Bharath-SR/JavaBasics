
public class StaticBlocksEx3 {
	
	static {
		System.out.println("A class static block");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		
		//here using forName method to call another class
		Class.forName("B");
		Class.forName("C");

	}

}
