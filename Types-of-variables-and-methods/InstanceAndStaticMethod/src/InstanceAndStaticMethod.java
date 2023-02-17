
public class InstanceAndStaticMethod {

	//Instance Method
	void m1() {
		System.out.println("m1 method");
	}
	//Static Method
	static void m2() {
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		// Access instance method using object
		InstanceAndStaticMethod is=new InstanceAndStaticMethod();
		is.m1();
		//Acccess static method using class name
		InstanceAndStaticMethod.m2();

	}

}
