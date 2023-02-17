
public class UserDefinedConstructorEx2 {

	UserDefinedConstructorEx2(int z){
		System.out.println("parameter constructor");
	}
	
	public static void main(String[] args) {
		//here default constructor will not be generated since we declared one constructor
		
		//if user didn't declare any constructor then at runtime default constructor will be generated
		
		
		//UserDefinedConstructorEx2 uc=new UserDefinedConstructorEx2(); it will throw error 
		
		UserDefinedConstructorEx2 uc1=new UserDefinedConstructorEx2(10);
		

	}

}
