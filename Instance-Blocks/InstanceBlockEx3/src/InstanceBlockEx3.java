
public class InstanceBlockEx3 {
	
	InstanceBlockEx3(){
		this(10);
		System.out.println("0-args cons");
	}
	InstanceBlockEx3(int z){
		System.out.println("1-args cons");
	}
	
	//Instance block execution depends on object creation but not how number of constructors are declared
	
	//here one object is created so only one time instance block will be executed
	{
		System.out.println("Insatance Block");
	}
	public static void main(String[] args) {
		
		new InstanceBlockEx3();

	}

}
