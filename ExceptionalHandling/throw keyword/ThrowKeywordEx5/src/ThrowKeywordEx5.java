import java.util.Scanner;

public class ThrowKeywordEx5 {
	
	
	//creating user-defined un-checked exception using param cons

	
	void eligible(int age) {
		if(age>18) {
			System.out.println("You are eligible to vote");
		}else {
			throw new InvalidAgeExceptionParamChecked("Invalid age Exception Unchecked");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=scan.nextInt();
		ThrowKeywordEx5 checked=new ThrowKeywordEx5();
		checked.eligible(age);
		
		

	}

}
