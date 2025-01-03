package CoreJava;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandelingDemo {
//In  Java,Exception Handeling is a mechanism to handle runtime errors,
//ensuring the normal flow of application

//	try,catch,finally,throw,throws
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			int x,y;
			
			System.out.println("Enter No1:");
			x = sc.nextInt();
			
			System.out.println("Enter No2:");
			y = sc.nextInt();
			
			System.out.println("Addition = "+(x+y));
			System.out.println("Subtraction = "+(x-y));
			System.out.println("Multiplication = "+(x*y));
			System.out.println("Division = "+(x/y));
			
		
////			
///
			String str = null;
			System.out.println(str.length());
			String a = "hello";
			System.out.println(a.charAt(100));

		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception Caught : "+e);
		}
		
		catch (InputMismatchException ie)
		{
			System.out.println("Exception Caught : "+ie);
		}
		
////		catch (Exception e)
////		{
////			System.out.println("Exception Occured : "+e);
////		}
////		
////		finally {
////			sc.close();
////			System.out.println("Scanner Object Closed");
//		}
		
		
		

	}

}
