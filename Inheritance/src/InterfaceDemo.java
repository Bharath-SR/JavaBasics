
public class InterfaceDemo {
public static void main(String[] args) {
	try{
	Maths math=new Maths();
	math.accept(new MyCalculator1());
	
	math.accept(new MyCalculator2());
	
}
	catch (Exception e)
	{
		System.out.println(e);
	}}
}
