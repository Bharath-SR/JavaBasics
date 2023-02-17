
public class FinallyEx3 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException nl) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}
		
		//here only finally block will be executed since try will throw AE exception
		//and in catch we are catching null pinter exception
		//so program will terminate abnormally
	}

}
