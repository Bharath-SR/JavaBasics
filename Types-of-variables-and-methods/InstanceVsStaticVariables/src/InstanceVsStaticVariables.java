
public class InstanceVsStaticVariables {

	int a=10;
	static int b=15;
	public static void main(String[] args) {
		InstanceVsStaticVariables is=new InstanceVsStaticVariables();
		System.out.println(is.a);
		System.out.println(is.b);
		is.a=99;
		is.b=88;
		System.out.println(is.a);
		System.out.println(is.b);
		InstanceVsStaticVariables is1=new InstanceVsStaticVariables();
		System.out.println(is1.a);
		System.out.println(is1.b);
		is1.b=77;
		InstanceVsStaticVariables is2=new InstanceVsStaticVariables();
		System.out.println(is2.a);
		System.out.println(is2.b);
		
		

	}

}
