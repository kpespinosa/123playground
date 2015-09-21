class Animal{
	abstract void  move();
}

class Person extends Animal{
	void move(){
		System.out.println("moving..");
	}
}

class Tester{
	public static void main(String[] args){
			Animal a;
			// a = new Animal();//Compile-error
			// a = new Person();//same compile error
			a = new Person();
			a.move();
	}
}