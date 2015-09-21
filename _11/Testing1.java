class Person{
	int age;
	void move(){
		// if(age == 50){
		// 	fly();
		// }else{
		// 	System.out.println("walk only.");
		// }
		//1
		// age = 50;
		// if(age == 50){
		// 	fly();
		// }else{
		// 	System.out.println("walk only.");
		// }

		//2
		fly();
	}
	void fly(){
		System.out.println("flying now!!");
	}
}
class Tester{
	public static void main(String[] args){
		//testMove();//test driver
		//stub
		// Person p = new Person();
		// p.move();//should be flying now!
		// assert 1==(0):"It is false";
		Person p1 = new Person();
		Person p2 = new Person();
		assert p1.equals(p2):"Not same person!";
	}

	public static void testMove(){
		//test driver
		// Person p = new Person();
		// p.age = 20;
		// p.move();//should be "walk only"
		// p.age = 50;
		// p.move();//should be "flying now!""


	}
}