
public class FinallyEx2 {

	public static void main(String[] args) {
		
		//here arithmetic exception occurs so..catch and finally block will be prinbted
		//finally block will always be printed
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}

	}

}
