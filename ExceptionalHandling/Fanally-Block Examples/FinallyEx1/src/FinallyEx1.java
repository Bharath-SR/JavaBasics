
public class FinallyEx1 {

	public static void main(String[] args) {
		
		//here try and finally block will be printed since there is no ae exception
		try {
			System.out.println("try block");
		}catch(ArithmeticException ae){
			System.out.println("catch block");
		}
		finally {
			System.out.println("Finally block");
			
		}

	}

}
