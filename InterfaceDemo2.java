package CoreJava;




interface Player {
	void run();
	void jump();  
	void punch(); 
	
}

interface PowerUp{
	void highJump();
	void bigSize();
	void StrongPunch();
}



class SuperMario implements Player , PowerUp{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("SUPER MARIO RUNS!!!");
		
	}

	@Override
	public void jump() {
		System.out.println("SUPER MARIO JUMPS");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		System.out.println("SUPER MARIO PUNCHES");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void highJump() {
		// TODO Auto-generated method stub
		System.out.println("SUPER MARIO JUMPS HIGH");
		
	}

	@Override
	public void bigSize() {
		// TODO Auto-generated method stub
		System.out.println("SUPER MARIO INCREASE SIZE");
	}

	@Override
	public void StrongPunch() {
		// TODO Auto-generated method stub
		System.out.println("Strong Punch");
	}
	
	
	
}
// innterface all methods are fully abstract

public class InterfaceDemo2 {

}
