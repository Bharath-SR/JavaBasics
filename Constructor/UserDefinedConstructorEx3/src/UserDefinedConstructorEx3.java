
public class UserDefinedConstructorEx3 {
	
	//instanace variables
	int eid;
	String ename;
	float esal;
	
	//user-defined constructor
	//main advantage of user defined constructor is instance variables values can be initialized during 
	//object creation
	
	UserDefinedConstructorEx3(){
		eid=100;
		ename="bharath";
		esal=1000.00f;
				
	}
	
	//method
	void display() {
		System.out.println("Employee id is :" + eid);
		System.out.println("Employee name is :" + ename);
		System.out.println("Employee salary is :" + esal);
	}
	public static void main(String[] args) {
		
		UserDefinedConstructorEx3 uc=new UserDefinedConstructorEx3();
		uc.display();

	}

}
