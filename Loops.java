package demo;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Loop  - Repetition
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);

//		SOLID PRINCIPLE - S O L I D-Dont Repeat Yourself
//		for ( initialization;condition testing;increment/decrement)
//		for (int i=1;i<=10;++i)
//		{
//			System.out.println(i);
//		}
//		int a = 5;
//		System.out.println(a++);
//		System.out.println(a);
		
//		a++ - post increment
//		++a - pre increment
		
//		for (int i=1;i<=5;i--)
//		{
//			System.out.println(i);
//		}

// find the sum of first 10 natural nos
//		int result = 0;
//		for(int i=1;i<=10;i++)
//		{
//			result += i;
//		}
//		System.out.println(result);
		
//  break and continue
//		break statement is used to transfer the control flow of program outside the loop
		
//		for (int i=1;i<=100000;i++)
//		{
//			if (i==10)
//			{
//				break;
//			}
//			System.out.println(i);
//		}
		
//		continue
//		continue statement - it is used to transfer the control flow of program to the
//		starting of the loop
		
//		for (int i=1;i<=20;i++)
//		{
//			if (i%3==0)
//			{
//				continue;
//			}
//			System.out.println(i);
//		}
		
//		Write a program to print first 10 numbers of fibonacci Series.
//		0 1 1 2 3 5 8.......................
		
		int first = 0;
		int second = 1;
		System.out.print(first+" "+second+" ");
		for (int i=1;i<=8;i++)
		{
			int third = first+second;
			System.out.print(third+" ");
			first = second;
			second = third;
			
		}
	}

}
