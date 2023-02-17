//method with parameters of object

class X{}
class Emp{}
class Y{}
class Student{}
public class InstanceAndStaticMethodExample3 {
	
	void m1(X x,Emp e) {
		System.out.println("m1 method");
	}
	void m2(Y y,Student s) {
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		InstanceAndStaticMethodExample3 is3=new InstanceAndStaticMethodExample3();
		X x=new X();
		Emp e1=new Emp();
		is3.m1(x, e1);
		Y y=new Y();
		Student s=new Student();
		is3.m2(y, s);

	}

}
