import java.util.Scanner;

public abstract class  MyCalculator2 implements Calculator{
	public void mul()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 2 nos");
		int a =scan.nextInt();
		int b=scan.nextInt();
		int c=a*b;
		
		
		System.out.println(c);
	}
	public void div()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 2 nos");
		int a =scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		
		
		System.out.println(c);
	}
}
