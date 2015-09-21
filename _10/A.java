package _10;

class A{
	protected int age;
	void info(){
		
	}
	void accept(Animal a){
		a.eat();
	}
}

class B extends A{
	void info(){
		System.out.println(age);
	}

}

class Test{
	public static void main(String[] args){
		A a = new B();
		//a.info();

		Person p = new Person();
		Animal b = new Animal();
		a.accept(b);
	}
}