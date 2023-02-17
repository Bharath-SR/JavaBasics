
public class MethodReturnVariableType {
	
	//instance variable
	
	int x=100;
	
	int m1(int x) { //local variable
		
		//if there are two variables with same name then priority always goes to local
		System.out.println("m1 method");
		return x;
	}
	
	//if no local variable then instance variable will be printed
	int m2() {
		System.out.println("m2");
		return x;
	}
	
	//if local variable is present and instance should be printed then use this keyword
	
	int m3(int x) {
		System.out.println("m3 method");
		return this.x;
	}
	

	public static void main(String[] args) {
		MethodReturnVariableType ty=new MethodReturnVariableType();
		int a=ty.m1(10);
		System.out.println(a);
		int b=ty.m2();
		System.out.println(b);
		int c=ty.m3(30);
		System.out.println(c);

	}

}
