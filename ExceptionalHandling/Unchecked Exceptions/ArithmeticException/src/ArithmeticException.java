
public class ArithmeticException {
	
	//Unchecked Exception will occur at runtime
	//Exceptions which are not checked by compiler is called unchecked exception,
	//those exceptions should be handled at the runtime

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello World1");
		System.out.println(10/0);//here arithmetic exception will occur
		
		//after exception below code wont be executed
		//it can be handled by using try,catch block or throws keyword
		System.out.println("Hello World2");
		System.out.println("Hello World3");

	}

}
