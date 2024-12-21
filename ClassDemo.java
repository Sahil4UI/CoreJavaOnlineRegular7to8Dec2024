package CoreJava;


class Animal{
	
	int eyes;
	int legs;
	int tail;
	String sound;
	
//	Write Once Use Anywhere
	void display()
	{
		System.out.println("Eyes = "+eyes);
		System.out.println("Legs = "+legs);
		System.out.println("Tail = "+tail);
		System.out.println("Sound = "+sound);
	}
	
}



public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ClassName objname = new ClassName();
		Animal dog = new Animal();
		dog.eyes=2;
		dog.legs=4;
		dog.tail = 1;
		dog.sound = "Bhow Bhow";
		dog.display();
		

		
		Animal cow= new Animal();
		
		

	}

}
