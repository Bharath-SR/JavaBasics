import java.util.Scanner;

public class SinglyLinkedListMain {
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	SinglyLinkedList sl=new SinglyLinkedList();
	while (true)
	{

		System.out.println("press 1......>InsertRear");
		System.out.println("press 3......>InserFront");
		System.out.println("press2 .......>deleteRear");
		System.out.println("press4....>deleteFront");
		System.out.println("press 5......>dispaly");
		System.out.println("presss any number ......>to stop");
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		switch(choice)
		
		{
		case 1 :sl.insertRear();
		break;
		case 2 : sl.insertFront();
		break;
		case 3 : sl.deleteRear();
		break;
		case 4 : sl.deleteFront();
		break;
		case 5 : sl.display();
		break;
		default: System.exit(0);
		}
	}
}
}
