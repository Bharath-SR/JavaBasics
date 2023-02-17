
public class MethodReturnValuePrimitiveDatatype {
	
	
	int m1() {
		return 10;
	}
	
	float m2() {
		return 10.0f;
	}
	
	static char m3() {
		return 'v';
	}

	public static void main(String[] args) {
		//instatnce variables calling using object
		
		MethodReturnValuePrimitiveDatatype pd=new MethodReturnValuePrimitiveDatatype();
		int x=pd.m1();
		System.out.println("method m1 return value is : " +x);
		
		float t=pd.m2();
		System.out.println("method m2 return value is : " +t);
		
		//static variable calling directly using class name
		
		char d =MethodReturnValuePrimitiveDatatype.m3();
		System.out.println("method m3 return value is : " +d);
		
		//In project level we wont return primitive values actually

	}

}
