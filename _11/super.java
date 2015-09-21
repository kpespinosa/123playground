class Animal{
	void move(){
		System.out.println("A moves");
	}
}
class Bat extends Animal{

}

// class C extends B{
// 	void fly(){
// 		System.out.println("fly");
// 	}
// }
class Test{
	public static void main(String[] args){
		Animal a;
		Bat b = new Bat();
		a = b;//1
		if(a instanceof Bat)
		 	b = a;//2

		b = (Bat)a;//3
		a = new Animal();
		if(a instanceof Animal)
			System.out.println("lies!");
		else
			b = (Bat)a;//4
			


		// A a = new C();
		// a.move();
		// a.fly();//1
		// C c = new C();
		// c.fly();//2

	}
}