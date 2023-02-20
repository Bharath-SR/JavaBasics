import java.util.Scanner;

public class SinglyLinkedList {
class linkedlist{
	class node{
		int data;
		node link;
	}
	private node first;
	private Scanner scan=new Scanner (System.in);
	
	public void insertRear()
	{
		node temp;
		System.out.println("enter an element");
		int elem=scan.nextInt();
		node newnode=new node();
		newnode.data=elem;
		newnode.link=null;
		if (first==null)
		{
			first=newnode;
		}
		else{
			temp=first;
			while(temp.link!=null)
			{
				temp=temp.link;
			}
			temp.link=newnode;
		}
	}
	public void  deleteRear()
	{
		node temp;
		if (first==null)
		{
			System.out.println("deletion  not possible");
		}
		else if (first.link==null)
		{
			System.out.println("elemnt deleted is "+ first.data);
			first=null;
		}
		else
		{
			temp=first;
			while(temp.link.link!=null)
			{
				temp=temp.link;
				
			}
			System.out.println("element deleted is "+ temp.link.data);
			temp.link=null;
		}
		
	}
	public void insertFront()
	{
		System.out.println("enter an element");
		int elem=scan.nextInt();
		node newnode=new node();
		newnode.data=elem;
		newnode.link=null;
		if (first==null)
		{
			first=newnode;
			
		}
		else{
			newnode.link=first;
			first=newnode;
		}
		
	}
	public void deleteFront()
	{
		if (first==null)
		{
			System.out.println( "deletion not possible");
		}
		else if(first.link==null)
		{
			System.out.println("element deleted is "+first.data);
			first =null;
		}
		else
		{
			System.out.println("element deleted is "+first.data);
			first=first.link;
		}
	}
	public void display()
	{
	node temp;
	if (first==null)
	{
		System.out.println("display not possible");
	}
	else if (first.link==null)
	{
		System.out.println(first.data);
		
	}
	else
	{
		temp=first;
		while (temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.link;
		}
		System.out.println();
	}
}
}






}
