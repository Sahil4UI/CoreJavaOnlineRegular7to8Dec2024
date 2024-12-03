package demo;
//step1
import java.util.Scanner;
public class IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Second Step - Create Object of Scanner
//		new - object creation 
		
//		you have three given sides,if they can form a traingle,which traingle is it....?
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side1 : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Side2 : ");
		int b = sc.nextInt();
		
		System.out.println("Enter Side3 : ");
		int c = sc.nextInt();
		
		if (a+b>c && b+c>a && c+a>b)
		{
			if (a==b && b==c)
			{
				System.out.println("Equilateral Traingle");
			}
			else if (a==b || b==c || c==a)
			{
				System.out.println("Isoceles Traingle");
			}
			else {
				System.out.println("Scalene Traingle");
			}
		}
		else {
			System.out.println("Not A Traingle");
		}
		sc.close();
	}

}
