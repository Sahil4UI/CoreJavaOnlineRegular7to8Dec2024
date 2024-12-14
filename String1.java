package demo;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String x1 = "Hello";
//		System.out.println(x1.codePointAt(0));
//		String x2 = "Hello";
//		new  - new memory allocated
//		String x2 = new String("Welcome");
//		String x3 = new String("to");
//		String x4 = new String("Python");
//		System.out.println(x1.compareTo(x2));
//		System.out.println(x1.codePointAt(0)-x2.codePointAt(0));
//		System.out.println(x1.startsWith("h"));
//		System.out.println(x1.endsWith("O"));
//		System.out.println(x1==x2);
//		System.out.println(x1.equals(x2));
//		System.out.println(x1.isEmpty());
//		System.out.println(x1.concat(x2));
//		String p = String.join(" ",x1,x2,x3,x4);
//		System.out.println(p);
//		System.out.println(p.substring(0,5));
//		System.out.println(p.lastIndexOf("o"));
//		System.out.println(p.replace("Python", "Java"));
//		System.out.println(p.replace("o", "x"));
//		System.out.println(p.replaceFirst("o", "x"));
//		String x[] = p.split(" ");
//		x[1] =x[1].replaceFirst("o", "x");
//		for (String a:x)
//		{
//			System.out.print(a+" ");
//		}
//		
//		String a = "  hello   ";
//		System.out.println(a);
//		System.out.println(a.trim());
//		String str1= "This is Exercise 1";                                                                               
//		String str2= "This is Exercise 2";
//		System.out.println();
//		int cmp = str1.compareTo(str2);
//		if (cmp==0)
//		{
//			System.out.println(str1+" and "+str2+" are equal");
//		}
//		else if (cmp>0)
//		{
//			System.out.println(str1+" is greator than "+str2);
//		}
//		else {
//			System.out.println(str1+" is less than "+str2);
//		}
		
//		Write A Program to find occurence of each character
//		in a String
		
	// 	String x = "aabbccddaabbeeccdff";
	// 	String res = "";
	// 	for (char i:x.toCharArray())
	// 	{
	// 		if (!res.contains(""+i))
	// 		{
	// 			res+=i;
	// 		}
	// 	}
	// 	System.out.println(res);
		
	// 	for (int i=0;i<res.length();i++)
	// 	{
	// 		char temp = res.charAt(i);
	// 		int count = 0;
	// 		for (int j=0;j<x.length();j++)
	// 		{
	// 			if (temp == x.charAt(j))
	// 			{
	// 				count++;
	// 			}
	// 		}
	// 		System.out.println("count of "+temp+" is "+count);
	// 	}

	//OR

	String s = "aabbccddaabbeeccdff";
	String res = "";
	
	int arr[] = new int[26];
	
	for(char i : s.toCharArray()){
		arr[i - 'a']++;
	}
	
	for(int i=0; i<26; i++){
	if (arr[i]>0){
		res+=""+(char)(i+'a');
		System.out.println("count of "+(char)(i+'a')+" is "+arr[i]);
	}
	}
	
	System.out.println(res);


	}

}
