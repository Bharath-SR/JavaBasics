
public class MethodCurrentClassReturn {
	
	MethodCurrentClassReturn m1(){
		System.out.println("method 1");
		MethodCurrentClassReturn c=new MethodCurrentClassReturn();
		return c;
	}
	MethodCurrentClassReturn m2() {
		System.out.println("method 2");
		return this;
	}
	
	public static void main(String args[]) {
		MethodCurrentClassReturn r=new MethodCurrentClassReturn();
		MethodCurrentClassReturn m1=r.m1();
		MethodCurrentClassReturn m2=r.m2();
	}
	

}
