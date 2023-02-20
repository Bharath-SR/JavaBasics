import java.util.Scanner;

public class CircularQueue {
private int cq[];
private int size;
private int r=-1;
private int f=0;
private int count=0;
Scanner scan =new Scanner(System.in);
public CircularQueue(int n) {
	cq=new int [n];
	size=cq.length;
	
}
public void insert()
{
	int ele;
	if (count==size)
	{
		System.out.println("insertion not possible");
		
	}
	else{
		System.out.println("enter an element");
		ele=scan.nextInt();
		r=(r+1)%size;
		cq [r]=ele;
		++count;
	}
	
}
public void delete()
{
	if(count==0)
	{
		System.out.println("deletion not possible");
		
	}
	else
	{
		System.out.println("element delted is" + cq[f]);
		f=(f+1)%size;
		--count;
	}
}
public void display()
{
	int f1=f;
	if (count==0)
	{
		System.out.println("diplay not possible");
		
	}
	else
	{
		for(int i=1;i<=count;i++)
		{
			System.out.print(cq[f1]+" ");
			f1=(f1+1)%size;
			
		}
		System.out.println();
	}
}
}
