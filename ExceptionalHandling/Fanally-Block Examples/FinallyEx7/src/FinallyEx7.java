
public class FinallyEx7 {

	public static void main(String[] args) {
		
		System.out.println(10/0);
		//in this program finally will not be executed since control is not in try block
		//so finally will not be executed
		try {
			System.out.println("try");
		}
		catch(ArithmeticException aer) {
			System.out.println("catch");
		}
		finally {
			System.out.println("Finally  block");
		}

	}

}
