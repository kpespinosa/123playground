interface Movable{
	public void move();
}

interface Comparable{
	public int compareTo(Object o);
}
class Animal{
	int age;
}

class Person extends Animal implements Movable, Comparable, MovableAndComparable{
	String name;

	Person(String name, int age){
		this.age = age;
		this.name = name;
	}
	public void move(){
		System.out.println("Person moving..");
	}
	public int compareTo(Object o){
		if(!(o instanceof Person)){
			return -1;
		}
		Person p = (Person)o;
		if(this.age != p.age){
			return -1;
		}else{
			return 0;
		}
	}
	public void moco(){
		System.out.println("moco");
	}
}

interface MovableAndComparable extends Movable, Comparable{
	void moco();
}

class Tester2{
	public static void main(String[] args){
		Person p1 = new Person("Kurt", 20);	
		Person p2 = new Person("Ryan", 20);
		System.out.println(p1.compareTo(p2));

		Comparable p3 = new Person("Robert", 30);
		MovableAndComparable p4 = new Person("Dem", 30);
		p4.moco();

	}
}