
public class UserDefinedConstructor {

	
	void m1() {
		System.out.println("m1 method");
	}
	UserDefinedConstructor(){
		System.out.println("0-arg constructor");
	}
	UserDefinedConstructor(int a){
		System.out.println("1-arg constructor");
	}
	//user defined constructor
	public static void main(String[] args) {
		//object creation
		UserDefinedConstructor uc=new UserDefinedConstructor();
		UserDefinedConstructor uc1=new UserDefinedConstructor(10);//parameterized constructor
		uc.m1();
		uc1.m1();
		


	}

}
