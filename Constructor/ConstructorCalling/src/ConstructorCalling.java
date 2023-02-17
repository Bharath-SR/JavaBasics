
public class ConstructorCalling {

	//ConstructorCalling is done using this keyword
	
	ConstructorCalling(){
		this(10); // in constructor calling this keyword should be first statement else error will be generated
		//this(10,20);//and only one constructor can be called from one constructor and it should be first statement
		System.out.println("0-arg constructor");
	}
	
	//one constructor will call only one constructor at a time
	ConstructorCalling(int a){
		this(10,20);
		System.out.println("1-arg constructor");
	}
	ConstructorCalling(int a,int b){
		this(10,20,30);
		System.out.println("2-arg constructor");
	}
	ConstructorCalling(int a,int b, int c){
		System.out.println("3-arg constructor");
	}
	public static void main(String[] args) {
		//object creation
		ConstructorCalling cc=new ConstructorCalling();
		

	}

}
