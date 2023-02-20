import java.util.Scanner;

public class CircularQueueMain {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("enter the  size of circular queue");
	int n=scan.nextInt();
	CircularQueue cq=new CircularQueue(n);
	while (true)
	{
		System.out.println("press 1......>Insert");
		System.out.println("press2 .......>delete");
		System.out.println("press3....>display");
		System.out.println("presss any number ......>to stop");
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		switch(choice)
		
		{
		case 1:cq.insert();
		break;
		case 2:cq.delete();
		break;
		case 3:cq.display();
		break;
		default: System.exit(0);
		}
	}
}
}
