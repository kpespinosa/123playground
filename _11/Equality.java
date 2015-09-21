class Equality{
	public static void main(String[] args){
		Dog a = new Dog("poodle");
		Dog b = new Dog("poodle");

		// System.out.println(a==b);	
		// System.out.println(a.equals(b));		

		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);

		// System.out.println(i1 == i2);		
		// System.out.println(i1.equals(i2));

		String s1 = new String("hi");
		String s2 = new String("hi");

		// System.out.println(s1 == s2);
		// System.out.println(s1.equals(s2));
		s1 = "hi";
		s2 = "hi";
		// System.out.println(s1 == s2);
		// System.out.println(s1.equals(s2));


	}
}

class Dog{
	String breed;
	Dog(String breed){
		this.breed = breed;
	}
	public boolean equals(Object dog){
		if(!(dog instanceof Dog) ){
			return false;
		}
		Dog d = (Dog)dog;
		if(breed.equals(d.breed)){
			return true;
		}
		return false;
	}

}