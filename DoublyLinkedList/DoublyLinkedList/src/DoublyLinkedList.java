import java.util.Scanner;

public class DoublyLinkedList {
    class Node
    {
    	Node preLink;
    	int data;
    	Node nextLink;
    	
    }
    private Node first;
    private Scanner scan=new Scanner(System.in);
    public void insertFront()
    {
    	System.out.println("enter an element");
    	int elem=scan.nextInt();
    	
    	Node newnode =new Node();
    	newnode.data=elem;
    	newnode.preLink=null;
    	newnode.nextLink=null;
    	if (first==null){
    		first =newnode;
    		
    	}
    	else
    	{
    		newnode.nextLink=first;
    		first.preLink=newnode;
    		first=newnode;
    	}
    }
    public void insertRear()
    {
    	Node temp;
    	System.out.println("enter an element ");
    	int elem=scan.nextInt();
    	Node newnode=new Node();
    	newnode.data=elem;
    	newnode.preLink=null;
    	newnode.nextLink=null;
    	if (first==null){
    		first =newnode;
    		
    	}
    	else
    	{
    		temp=first;
    		while(temp.nextLink!=newnode)
    		{
    			temp=temp.nextLink;
    			
    		}
    		temp.nextLink=newnode;
    		newnode.preLink=temp;
    	}
    	
    }
    public void deleteFront()
    {
    	if (first==null)
    	{
    		System.out.println("deletion not possible");
    	}
    	else if(first.nextLink==null)
    	{
    		System.out.println("elemnt deleted is "+ first.data);
    		first=null;
    		
    	}
    	else
    	{
    		first=first.nextLink;
    		first.preLink=null;
    	}
    }
    public void deleteRear()
    {
    	Node temp=first;
    	if (first==null)
    	{
    		System.out.println("deletion not possible");
    	}
    	else if(first.nextLink==null)
    	{
    		System.out.println("elemnt deleted is "+ first.data);
    		first=null;
    		
    	}
    	else
    	{
    		System.out.println("element deleted is "+ temp.nextLink.data);
    	temp.nextLink=null;
    	
    	}
    }
    public void displayForward()
    {
    	Node temp;
    
    	if (first==null)
    	{
    		System.out.println("display not possible");
    	}
    	else if(first.nextLink==null)
    	{
    		System.out.println(first.data);
    }
    	else
    	{
    		temp=first;
    		while(temp!=null)
    		{
    			System.out.print(temp.data+" ");
    			temp=temp.nextLink;
    		}
    		
    	}
    System.out.println();	
}
    public void displayReverse()
    {
    	Node temp;
    
    	if (first==null)
    	{
    		System.out.println("display not possible");
    	}
    	else if(first.nextLink==null)
    	{
    		System.out.println(first.data);
    }
    	else
    	{
    		temp=first;
    		while(temp.nextLink!=null)
    		{
    			
    			temp=temp.nextLink;
    		}
    		while(temp!=null)
    		{
System.out.print(temp.data+" ");
temp=temp.preLink;
    		}
    		
    	}
    System.out.println();	
}}
