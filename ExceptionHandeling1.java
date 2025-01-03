package CoreJava;

public class ExceptionHandeling1 {
	
	public static void validateAge(int age)
	{
		if (age < 18)
		{
			throw new ArithmeticException("Not Eligible to Vote !!!");
		}
		else {
			System.out.println("Welcome to Vote!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(19);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception Caught : "+e.getMessage());
		}
		System.out.println("********");

	}

}
