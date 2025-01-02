package CoreJava;



class Student{
//	instance variables / Class Members
	private int roll;
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		if(roll>0)
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	private String name;
	private int marks;
	
	
//	Student()
//	{
//		System.out.println("Default Constructor");
//	}
//	local variable
	
//	Constructor is a function defined by ClassName 
//	it is used as a initializer
//	Constructor isn't needed to be called,it gets automatically called at the time of
//	object Creation
	
	
//	this refers to current class.
//	this is used to differentiate class members(instance variables) from  local variables
	
	Student(int roll , String name , int marks)
	{
			roll =roll;
			name = name;
			marks = marks;
	}
	
	void show()
	{
		   System.out.println("RollNo = "+roll);
	       System.out.println("Name = "+name);
	       System.out.println("Marks = "+marks);
	}
}


public class IS_A2 {
    public static void main(String[] args) {
    	Student obj = new Student(0,"Ravi",99);
    	obj.setRoll(-10);
    	
    	System.out.println("Marks ="+obj.getMarks());
        obj.show();
        
	}
    
}
