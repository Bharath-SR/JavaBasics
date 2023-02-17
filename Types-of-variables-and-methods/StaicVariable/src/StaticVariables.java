 
public class StaticVariables {
	
	//static variable
	static int a=1000;
	static int b=2000;
	

	public static void main(String[] args) {
		//static area
		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.b);
		StaticVariables s=new StaticVariables();
		s.method1();
	}

	//instance method
	void method1()
	{
		//instance area
		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.b);
	}
}
