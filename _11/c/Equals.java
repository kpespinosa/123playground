class Person{
	String name;
	Person(String name){
		this.name = name;
	}
	// public boolean equals(Person obj){
	// 	//Person p = obj;
	// 	return this.name.equals(obj.name);
	// }
	public boolean equals(Object obj){
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;
		return this.name.equals(p.name);
	}
}
class Test1{
	public static void main(String[] args){
		Person p1 = new Person("Kurt");
		String p2 = new String("Kurt");

		// System.out.println(p1==p2);
		System.out.println(p1.equals(p2));

	}
}