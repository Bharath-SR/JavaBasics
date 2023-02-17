import java.util.Scanner;

public class ThrowKeywordEx2 {

	
		//creation of user defined checked exception using default constructor
		static void vote(int age) throws InvalidAgeException {
			if(age>18) {
				System.out.println("Eligible to vote");
			}else {
				throw new InvalidAgeException();
			}
		}
	public static void main(String[] args) throws InvalidAgeException {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=scan.nextInt();
		ThrowKeywordEx2.vote(age);
		
		
	}

}
