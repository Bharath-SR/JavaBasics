import java.util.Scanner;

public class DoublyLinkedListMain {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	DoublyLinkedList dl=new DoublyLinkedList();
	while (true)
	{
		System.out.println("press 1......>InsertRear");
		System.out.println("press 3......>InserFront");
		System.out.println("press2 .......>deleteRear");
		System.out.println("press4....>deleteFront");
		System.out.println("press 5......>dispalyforward");
		System.out.println("press 6......>displayReverse");
		System.out.println("presss any number ......>to stop");
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		switch(choice)
		
		{
		case 1 : dl.insertRear();
		break;
		case 2 : dl.insertFront();
		break;
		case 3 : dl.deleteRear();
		break;
		case 4 : dl.deleteFront();
		break;
		case 5 : dl.displayForward();
		break;
		case 6:dl.displayReverse();
		break;
		default:System.exit(0);
	}
}
}}
