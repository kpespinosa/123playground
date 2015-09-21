class Animal{

}

class Dog extends Animal{

}

class Tester{
	public static void main(String[] args){
		Dog d = new Dog();
		Animal a = d;
		//write true if correct, 
		//otherwise, false but give the reason.
		// Animal a;

		// Dog d = new Dog();
		// a = d; //1
		// // d = a; //2

		// d = (Dog)a; //3
		// a = new Animal();
		// if(a instanceof Dog)
		// 	d = (Dog)a; //4
		// else
		// 	System.out.println("lies!");

	}
}