
public class FinallyEx5 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException at) {
			System.out.println("catch-block");
		}
		finally {
			System.out.println(10/0);
		}
//output
	/*	/catch-block
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at FinallyEx5.main(FinallyEx5.java:12)
*/
		
		//If exception raised other then try then program will terminate abnormally
	}

}
