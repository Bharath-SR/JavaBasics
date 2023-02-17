import java.util.Scanner;

public class ThrowKeywordEx3 {
	//creating userdefined checked exception using params constructor
	
	
	static void vote(int age) throws InvalidAgeExceptionParams {
		if(age>18) {
			System.out.println("Eligible to vote");
		}else {
			throw new InvalidAgeExceptionParams("Invalid age Exception/zero");
		}
	}
	public static void main(String[] args) throws InvalidAgeExceptionParams {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=Scan.nextInt();
		ThrowKeywordEx3.vote(age);
		

	}

}
