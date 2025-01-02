package CoreJava;


public class FunctionDemo {
	
//	Create Once Use Anytime
//	default function - no arguments , no return value - 
	
//	static functions can be called without object 
	
//	static void f1()
//	{
//		System.out.println("Hello this is default function");
//	}
	
//	parameterized function
//	static void f1(int a,int b)
//	{
//		System.out.println(a+b);
//	}
//	
	
//	Function with return value
	
//	static int f1(int a,int b)
//	{
//		return a+b;
////		return  - jaha se function call hota hai waha return krke fekdega value ko
//	}
	
//	Polymorphism - poly - many , morph - forms
	
//	Recursive Function 

// Recursion : 
//	when a function calls itself again and again...
//	that function is called recursive function..
	
//	Stack Falling
//	static void f1(int x)
//	{
////		base case - it is a condition which stops recursion
//		
//		if (x>5)
//		{
//			return;
//		}
//		
//		System.out.println(x);
//		f1(x+1);
//		System.out.println(x);
//		
//		
//	}
	
//	WAP to find the power of number using recursion
	
//	static int Power(int x,int y)
//	{
//		if (y==0)
//		{
//			return 1;
//		}
//		if (y==1)
//		{
//			return x;
//			
//		}
//		return x*Power(x,y-1);
//	}
	
	
//	FInd the Nth Fibonacci No
	static int Fib(int x)
	{
		
		if (x==1 || x==0)
		{
			return x;
		}
		
		return Fib(x-1) + Fib(x-2);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println( f1(23,35));
		
//		int res = f1(23,35);
//		System.out.println(res);
//		f1(1);
		
//		System.out.println(Power(2,4));
		System.out.println(Fib(6));
		
	}
}





































