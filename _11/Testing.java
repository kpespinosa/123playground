class Testing{
	public static void main(String[] args){
		Human a = new Human();
		a.age = 1;
		// System.out.println(a.move()+" should be walk");//test driver
		a.age = 0;
		// System.out.println(a.move()+" should be crawl");//test driver
		
		if(a.fly()){//made a stub that returns true always
			//some complex methods to be tested
			// System.out.println("Batman");
		}else{
			// System.out.println("Superman");
		}
		Human b = new Human();
		b.bday();
		assert b.age==2:"Did not celebrate!!";

	}
}


class Human{
	int age;

	String move(){
		if(age >= 1){
			return "walk";
		}else{
			return "crawl";
		}
	}
	//stub
	boolean fly(){
		return true;
	}
	void bday(){
		age++;
	}
}