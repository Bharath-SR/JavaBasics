
public class UserDefinedConstructorEx4 {
	
	//instance variable
	int eid;
	String ename;
	float esal;
	
	UserDefinedConstructorEx4(int eid,String ename,float esal){ //local variable
		//local variables scope is within the blockn so here it is within constructor itself	
		//so here we need to convert local value to instance value
		//use this keyword to if bothis local and instance variables are same
		//this will represent local variable
		
		//conversion of local values to instance values
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	
	void dispaly() {
		System.out.println("Employee id is :" + eid);
		System.out.println("Employee name is :" + ename);
		System.out.println("Employee salary is :" + esal);
	}

	public static void main(String[] args) {
		UserDefinedConstructorEx4 uc=new UserDefinedConstructorEx4(01,"bharath",10000.00f);
		uc.dispaly();
		UserDefinedConstructorEx4 uc2=new UserDefinedConstructorEx4(02,"rahul",80000.00f);
		uc2.dispaly();

	}

}
