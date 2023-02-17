import java.util.Scanner;

public class ThrowKeywordEx1 {

	//throw keyword is used to declare users own exception
	//and using throw keyword handover it to jvm
	
	static void vote(int age) {
		if(age>18) {
			System.out.println("Eligible to vote");
		}else {
		//creating user-defined exception
			//using throw to send to jvm
			//new to create new object
			//ArithmeticException is exception name
			
			//this is not recommended since arithmetic exception is predefined exception
			throw new ArithmeticException("age/0 arithmetic exception");
		}
	}
	public static void main(String[] args) {

		//using scanner for user input
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=scan.nextInt();
		ThrowKeywordEx1.vote(age);
		
		
	}

}
