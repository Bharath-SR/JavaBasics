
public class InstanceAndStaticMethodExample5 {

	//instance varaiable
	//to represent instance variable use this keyword
	
	//inside static method method this keyword is not allowed
	int x=1000;
	int y=2000;
	void add(int x,int y) {
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}

	public static void main(String[] args) {
		InstanceAndStaticMethodExample5 is5=new InstanceAndStaticMethodExample5();
		is5.add(50,50);

	}

}
