
public class InstanceBlocksEx1 {
	
	//constructor
	InstanceBlocksEx1(){
		System.out.println("Constructor");
	}
	//Instance Block
	//Instance Blocks and constructors both are executed at the object creation time
	//But first Instance Block will executed after that constructor will be executed.
	{
		System.out.println("Instance Block");
	}
	public static void main(String[] args) {

		new InstanceBlocksEx1();//nameless object
	}

}
