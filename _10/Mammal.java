class Mammal{
	protected int age;
	double weight;
	boolean sex;//male = true, female=false;

	Mammal(){
		age = 0;
		weight = 1.0;
	}
	Mammal(boolean sex){
		this();
		this.sex = sex;
	}
	void eat(){
		System.out.println("Mammal eating..");
	}
	void about(){
		System.out.println("Mammal: age="+age+", weight="+weight+", sex:"+(sex==true?"male":"female"));	
	}
}

class Human extends Mammal{
	String name;
	//calls Mammal default constructor: super()
	Human(){
		name = "baby";
	}

	//overrides Mammal eat() method
	void eat(){
		System.out.println("Human eating..a better way..");	
	}
	//calling the super.about()
	void about(){
		//super.about();
		System.out.println(age);
		System.out.println("Human: name="+name);	
	}
	void code(){
		System.out.println("Human coding..");
	}
}
class Upians extends Human{
	void code(){
		System.out.println("Upians code better..");	
	}
}

class Company{
	void hires(Human h){
		h.code();
	}
}

class Tester{
	public static void main(String[] args){
		Human h = new Human();
		Company c = new Company();
		// c.hires(h);
		h = new Upians();
		c.hires(h);

		// Mammal m = new Mammal();

		// doTricks(m);

		// Human h = new Human();

		// doTricks(h);

		// Mammal m = new Mammal();
		// m.eat(); // calls Mammal.eat
		// m = new Human();
		// m.eat(); //calls Human.eat

		// Mammal m = new Human(); //HUMANS ARE MAMMALS
		// Human h = new Mammal();// COMPILE-TIME ERROR

		// Mammal m = new Mammal();
		// m.about();
		// m = new Mammal(true);
		// m.about();
		// m = new Human();
		// m.about();

		// Mammal m = new Mammal();
		// m.eat();
		// Mammal h = new Human();
		// h.eat();
	}

	public static void doTricks(Mammal m){
		m.eat();
	}
}