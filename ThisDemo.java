package CoreJava;


//This Keyword - this referes to instance variable / used to differentiate instance and local var

//class A{
////	instance variable
//	int value;
//	
//	A(int value)
//	{
//		this.value = value;
//	}
//	
//	void show()
//	{
//		System.out.println(value);
//	}
//}

class MyClass

// COnstructor Chaining
{
	MyClass()
	{
		System.out.println("Default COnstructor Called.....");
	}
	
	MyClass(int x)
	{
		this();
		System.out.println("x = "+x);
	}
	
	MyClass(int x,int y)
	{
		this(x);
		System.out.println("y = "+y);
	}
}

// this - calling one constructor in another
public class ThisDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A obj = new A(10);
		MyClass obj = new MyClass(10,20);
//		obj.show();

	}

}
