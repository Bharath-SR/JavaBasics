
public class InstanceBlocksEx2 {
	
	InstanceBlocksEx2(){
		System.out.println("0-arg Cons");
	}
	InstanceBlocksEx2(int z){
		System.out.println("1-arg Cons");
	}
	InstanceBlocksEx2(int z,int y){
		System.out.println("2-arg Cons");
	}
	
	//instance block
	
	//here 3 times objects are created so three times instance block will be executed
	//whenever object is created instance block will be executed
	
	{
		System.out.println("Instance Block");
	}
	//in a class we can declare instance blocks
	{
		System.out.println("Instance Block2");
	}

	public static void main(String[] args) {
		//nameless object
		new InstanceBlocksEx2();
		new InstanceBlocksEx2(5);
		new InstanceBlocksEx2(10,20);

	}

}
