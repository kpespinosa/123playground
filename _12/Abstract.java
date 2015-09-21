abstract class Animal{
	abstract void  move();
}

class Person extends Animal{
	void move(){
		System.out.println("walking..");
	}
}

class Bat extends Animal{
	void move(){
		System.out.println("flying..");
	}
}
class Tester{
	public static void main(String[] args){
			Park p = new Park();
			Animal a = new Person();
			p.operate(a);
			a = new Bat();
			p.operate(a);
			// Animal a;
			// a = new Animal();//Compile-error
			// a = new Person();//same compile error
			// a.move();//prints 'moving..'
	}
}

class Park{
	void operate(Animal a){
		a.move();
	}
}