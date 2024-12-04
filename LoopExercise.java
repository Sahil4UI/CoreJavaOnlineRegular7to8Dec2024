package demo;
//import java.util.Scanner;
public class LoopExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	find the sum of digits of number
//		456 => 4+5+6=15
		
//		int x = 456;
//		int res =0;
//		
//		for (int i=x;i!=0;i=i/10)
//		{
//			int rem = i%10;
////			res = res+rem;
//			res += rem;
//		}
//		System.out.println(res);
		
//		find the reverse of no.
//		456 - 654
//		
//		int x = 456;
//		int res =0;
//		
//		for (int i=x;i!=0;i=i/10)
//		{
//			int rem = i%10;
//			res = res*10+rem;
//		}
//		System.out.println(res);
		
// Take a no as input and check whether the no is prime or not.
//		Scanner obj =  new Scanner(System.in);
//		System.out.print("Enter No : ");
//		int a = obj.nextInt();
//		int isPrime = 0;
//		for (int i=2;i<=a-1;i++)
//		{
//			if (a%i==0)
//			{
//				isPrime =0;
//				break;
//				
//			}
//			else {
//				isPrime=1;
//			}
//		}
//		
//		if (isPrime==1 || a==2)
//		{
//			System.out.println(a+" is Prime");
//		}
//		else {
//			System.out.println(a+" is not Prime");
//		}
//		obj.close();
		
//		for (int i=1;i<=3;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				System.out.println(i+","+j);
//			}
//		}
		
//		Pattern Questions : 
//		*
//		**
//		***
//		****
//		*****
//		no of columns : 5 , rows = 5
		for (int row=1;row<=5;row++)
		{
//			column loop yaha star print krega
			for (int col=1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
