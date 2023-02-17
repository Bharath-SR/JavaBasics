
public class StaticBlockEx1 {
	
	//static block execution will done only once when .class file loads into memory
	
	//instance block execution depends on object creation
	
	//constructor also depends on object creation creation
	
	//instance block
	{
		System.out.println("Instance Block 1");
	}
	{
		System.out.println("Instance Block 2");
	}
	//static block
	static{
		System.out.println("static Block 1");
	}
	static{
		System.out.println("static Block 2");
	}
	//constructor
	StaticBlockEx1(){
		System.out.println("0-arg param");
	}
	StaticBlockEx1(int z){
		System.out.println("1-arg param");
	}
	public static void main(String[] args) {
		// nameless object
		new StaticBlockEx1();
		new StaticBlockEx1(5);

	}

}
