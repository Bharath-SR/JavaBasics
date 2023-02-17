
public class InstanceVariables {

	//Instance Variables [object-created and object-destroyed]
	int a=10;
	int b=20;
	
	//static method
	public static void main(String[] args) {
		//program execution will start from main method
		//jvm will execute main method 
		//method1 is user defined so user should call it
		//static area
		InstanceVariables i= new InstanceVariables();
		System.out.println(i.a);
		System.out.println(i.b);
		i.method1();  
		

	}
	
	//instance method
	void method1() {
		//instance area
		System.out.println(a);
		System.out.println(b);
	}

}
