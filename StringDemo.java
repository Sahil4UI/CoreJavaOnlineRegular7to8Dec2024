package demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "hello Everyone";
		String y = " How are you ? ";
		System.out.println(x);
		System.out.println("Length = "+x.length());
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(x.concat(y));
		System.out.println(x+y);
		System.out.println(x.charAt(x.length()-1));
		System.out.println(x.indexOf('e',0));
		System.out.println(x.indexOf('e', 2));
		
	}

}
