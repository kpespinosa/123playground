class Mammal{
	private int legs;
	Mammal(){
		legs = 0;
	}
	Mammal(int legs){
		this.legs = legs;
	}
	void move(){
		System.out.println("Mammal moves."+legs);
	}
}

class Human extends Mammal{
	public int legs;
	Human(){
		// super();//calls Mammal(), init legs=0;
		super(3);
		//legs  =2;
	}
	void move(){
		//super.move();
		// legs = 3;
		System.out.println("Human moves."+this.legs);
	}
}

class Test{
	public static void main(String[] args){
		Mammal m = new Mammal();
		m.move();
		m = new Human();
		m.move();

		// m.move();
		// Human h = new Human();
		// h.move();	
	}
}