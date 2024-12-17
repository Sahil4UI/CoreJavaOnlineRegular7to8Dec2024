package demo;

//import java.util.Scanner;
import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x[] = {1,-10,20,100,34,56,34};
////		find the largest element from the array
////		find the second largest element from the array
//		int max = x[0];
//		int second_max = x[1];
//		for (int i:x)
//		{
//			if (i>max)
//			{
//				second_max=max;
//				max = i;
//			}
//			else if (i>second_max)
//			{
//				second_max = i;
//			}
//		}
//		System.out.println("Maximum="+max);
//		System.out.println("Second Maximum="+second_max);

		
//		int x[] = {1,-10,20,100,34,56,34};
//		Scanner sc  = new Scanner(System.in);
//		int choice=sc.nextInt();
//		int found=0;
//		for (int value:x)
//		{
//			if (value==choice)
//			{
//				found=1;
//				break;
//			}
//			else {
//				found=0;
//			}
//			
//		}
//		
//		System.out.println((found==1)?"FOund":"Not FOund");
////		write a program to find a given no in the array
////		if it is present print "Found"
////		else "Not Found"
		
//		Array Functions
		
//		int x[] = {1,-10,20,100,34,56,34};
//		binary search apply krna h to array sorted hona chaiye
//		Arrays.sort(x);
//		System.out.println("X = "+Arrays.toString(x));
//		System.out.println("Enter No:");
//		Scanner sc  = new Scanner(System.in);
//		int choice=sc.nextInt();
//		
//		int index = Arrays.binarySearch(x, choice);
//		System.out.println((index<0)?"Not Found":"Found");
//		int y[] = Arrays.copyOf(x, 3);
//		System.out.println("Y = "+Arrays.toString(y));

//		int x[] = new int[5];
//		Arrays.fill(x, 9);
//		System.out.println("x = "+Arrays.toString(x));

//	int x[] = {1,2,3,4,5};
//	int y[] = {1,2,3,5};
//	
//	System.out.println(Arrays.equals(x, y));
//		String arr[] = {"X","Y","Z"};
//		List<String> list = Arrays.asList(arr);
//		System.out.println(list);
		
//		int x[] = {1,2,3,4,5,6};
//		int res = Arrays.stream(x).sum();
//		System.out.println(res);
		
//		int x [] = {1,2,3,4,5,6,7,7,8,9,10};
//		Arrays.stream(x).filter(i -> i%2==0).forEach(System.out::println);
//		
		int x [] = {1,2,3,4,5,6,7,7,8,8,8,8,9,10};
		Arrays.stream(x).distinct().forEach(System.out::println);
		
	}

}
