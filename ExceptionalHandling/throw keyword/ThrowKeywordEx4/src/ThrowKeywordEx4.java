import java.util.Scanner;

public class ThrowKeywordEx4 {
	
	
	//userdefined un-checked exception using default constructor
	
	
	static void vote(int age) {
		if(age>18) {
			System.out.println("Eligible to vote");
		}else {
			throw new AgeInvalidException();
		}
	}
	
	

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=scan.nextInt();
		ThrowKeywordEx4.vote(age);
		
		
	}

}
