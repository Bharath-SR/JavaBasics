public class MethodReturnObject {

	//method which return object
	
	Emp m1() {
		System.out.println("m1 method");
		Emp e=new Emp();
		return e;
	}
	X m2() {
		System.out.println("m2 method");
		X x=new X();
		return x;
	}
	static String m3() {
		System.out.println("m3 method");
		return "bharath";
	}
	public static void main(String[] args) {
		MethodReturnObject o=new MethodReturnObject();
		Emp e1=o.m1();
		System.out.println(e1);
		X x1=o.m2();
		System.out.println(x1);
		String str=MethodReturnObject.m3();
		System.out.println(str);
		

	}

}
