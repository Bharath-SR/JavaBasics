
public class InstanceAndStaticMethodExample2 {

	//Local Variables
	//instance method
	void m1(int a,char b) {
		System.out.println("m1 Method");
		System.out.println(a);
		System.out.println(b);
	}
	//static method
	static void m2(String str,double d) {
		System.out.println("m2 Method");
		System.out.println(str);
		System.out.println(d);
	}
	public static void main(String[] args) {
		//instance method using object
		InstanceAndStaticMethodExample2 is2=new InstanceAndStaticMethodExample2();
		is2.m1(10, 'a');
		//static method call using class name
		InstanceAndStaticMethodExample2.m2("hello", 20.3);
		

	}

}
