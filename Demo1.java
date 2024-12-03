package demo;
// step1
import java.util.Scanner;
public class Demo1 {
	
//	void -empty
//	void - which returns nothing - which has no return statement
	

	public static void main(String[] args) {
		
//		String[] args -> Command Line Argument
//		 TODO Auto-generated method stub
//		System.out.println("Hey....");
//		int x=15;
//		float y= 11.4f;
//		String z = "Biswaranjan";
		
//		IF-else -Decision Making
//		step2 object creation of Scanner
//		ClassName objname = new ClassName();`
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("Enter No 1: ");
		x = sc.nextInt();
		System.out.println("Enter No 2: ");
		y = sc.nextInt();
		int res;
		
//		if (x>y)
//		{
//			System.out.println(x+" is largest");
//		}
//		else {
//			System.out.println(y+" is largest");
//		}
//		
		res = (x>y)?x:y;
		System.out.println(res+" is largest");
		sc.close();
	}
	
}
