class Person{
	String name;
	int age;
	Person(String name){
		this.name = name;
	}
	public boolean equals(Object obj){
		Person p = (Person)obj;
		return this.name.equals(p.name);
	}
	public boolean equals(Person obj){
		Person p = (Person)obj;
		System.out.println("here");
		return this.age == p.age;
	}
}

class Tester{
	public static void main(String[] args){
		Person p1 = new Person("Kurt");
		Person p2 = new Person("Kurt");

		System.out.println(p1.equals(p2));


		// System.out.println(p1==p2);//false
		// System.out.println(p1.equals(p2));//false
	}
}