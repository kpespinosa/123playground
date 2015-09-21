class TestStructuralEquality{
	public static void main(String[] args){
		DList2 d1 = new DList2();
		d1.insertFront(1);
		d1.insertFront(2);
		d1.insertFront(3);

		DList2 d2 = new DList2();
		d2.insertFront(1);
		d2.insertFront(2);
		d2.insertFront(3);

		// System.out.println(d1);
		// System.out.println(d2);

		//System.out.println(d1 == d2);
		//System.out.println(d1.equals(d2));

		assert d1!=d2:"they are not equal";

	}
}