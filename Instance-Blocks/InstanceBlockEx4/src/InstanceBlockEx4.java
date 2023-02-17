
public class InstanceBlockEx4 {
	
	int eid;
	
	//instance block is also used to initialize values to variables during object creation
	
	{
		eid=8;
	}
	
	void disp() {
		System.out.println("employee id is : "+eid);
	}

	public static void main(String[] args) {
		new InstanceBlockEx4().disp();
	}

}
