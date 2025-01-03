package CoreJava;

// partially abstract
abstract class Animals
{
	
//	abstract method - body-less function
	
	
	abstract void sound();
	
	
//	concrete function
	void sleep() {
			System.out.println("The Animal is Sleeping!!!");
	}
}


// abstract class ke abstract method ko implement krna pdta hai
// agar aapne abstract class ko inherit kia hai to

class Dog extends Animals{

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Bark Sound");
		
	}
	
}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.sound();
		dog.sleep();

	}

}
