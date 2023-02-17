
public class InstanceAndStaticMethodExample3 {

	//method calling
	void m1() {
		m2();//,method calling
		System.out.println("m1 method");
		m2();
	}
	void m2() {
		m3(10);
		System.out.println("m2 method");
	}
	void m3(int b) {
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		InstanceAndStaticMethodExample3 nis4=new InstanceAndStaticMethodExample3();
		nis4.m1();

	}

}
