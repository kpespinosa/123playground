class Mammal{
	protected int speed;
	Mammal(){
		speed = 100;
	}
	Mammal(int speed){
		this.speed = speed;
	}
	void move(){
		System.out.println("Mammal moves."+speed);
	}
}

class Human extends Mammal{
	int distance;
	//int speed = 80;//shadowing: shadows the speed var above
	Human(){
		super(30);//Mammal()
		distance = 10;
	}
	void move(){
		// int speed = 20;
		super.move();
		System.out.println("Human moves."+speed+"distance:"+distance);
	}
}
class Tester{
	public static void main(String[] args){
		Mammal m = new Mammal();
		m.move();//calls the move method of Mammal
		m = new Human();
		m.move();//calls the move method of Human

		// m = new Human();
		// m.move();

		// m.move();	
		
		// Human h = new Human();
		// h.move();

	}
}