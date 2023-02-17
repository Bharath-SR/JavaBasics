
public class FinallyEx4 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println(10/0);
		}
		finally {
			System.out.println("finally block");
		}
		
		//here only finally block will be executed 
		//since try throws ae exception and catch will also throw ae exception
		//program will execute try block and terminate abnormally
		
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at FinallyEx4.main(FinallyEx4.java:9)

	}

}
