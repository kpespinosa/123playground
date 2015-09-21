package _10;

class Animal{
	int age = 0;
	Animal(){
		age = 1;
	}
	Animal(int age){
		this.age = age;
	}
	void eat(){
		System.out.println("Animal eating..");
	}
	void info(){
		
	}
}
class Person extends Animal{
	int legs = 2;
	Person(){
		//implicit: super()
		super(2);
		legs = 4;
	}
	void info(){
		System.out.println("age:"+age);
	}
	void walk(){
		System.out.println("Person walking..");
	}
	void eat(){
		super.eat();
		System.out.println("Person kinamot..");
	}
}
class Tester{
	public static void main(String[] args){
		Animal a = new Person();
		a.eat();
		a = new Student();

		Person b =new Person();


		//a = new Animal();
		//a.eat();


		//Animal p = new Person();
		//p.info();

		//Animal p = new Student();
		//p.eat();

		/*Animal a = new Animal();
		a.eat();
		Animal p = new Person();
		p.eat();
		Person p2 = new Person();
		p2.eat(2);
		Student s = new Student();
		s.eat();
		s.study();
		*/

	}
}


class Student extends Person{
	int grade = 1;
	void study(){
		System.out.println("Student studying.."+age+", "+legs+", "+grade);
	}
	void eat(){
		super.eat();
		System.out.println("Student kinamot..");
	}
}