
public class FinallyEx8 {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.exit(0);  //exit() is static method which is used to shutdown jvm
		}
		catch(ArithmeticException ae) {
			System.out.println("catch");
		}
		
		//here finally block will not be executed since jvm is shutdown after line number 7
		//System.exit() will turn off jvm
		finally {
			System.out.println("finally");
		}
	}

}
