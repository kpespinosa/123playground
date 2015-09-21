class Mammal{
	void eat(){
		System.out.println("mammal eating");
	}
}

class Dog extends Mammal{
	void run(){
		System.out.println("Dog running");
	}
}

class Tester{
	public static void main(String[] args){
		Mammal m;
		Dog d = new Dog();
		m = d;
		// d = m;
		d = (Dog)m;
		m = new Mammal();
		
		if(m instanceof Dog){
			d = (Dog)m;
		}


		// Mammal m = new Mammal();
		// // m.eat();
		// m = new Dog();
		// m.eat();
		// m.run();




	}
}