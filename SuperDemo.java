package CoreJava;



// super keyword : 
//parent class constructor ko child class ke constructor me call krte hai

class Parent{
	Parent()
	{
		System.out.println("Parent's Default Constructor");
	}
	Parent(int x)
	{
		System.out.println("x = "+x);
	}
	
	void display()
	{
		System.out.println("Parent's Display Method!!!");
	}
}

//overriding
class Child extends Parent{
	Child()
	{
		super(20);
		System.out.println("Child's Default CONSTRUCTOR");
	}
	
	void display()
	{
		super.display();
		System.out.println("Child's Display Method!!!");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.display();

	}

}
