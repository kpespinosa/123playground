class StackHeap{
	public static void main(String[] args){
		int a = 1;
		test1(a);
		System.out.println(a);
		Box b = new Box();
		b.set(b);
		System.out.println(b.i);
		b.set2(b);
		System.out.println(b.i);
	}
	static void test1(int x){
		x = 2;
	}
}

class Box{
	int i;
	void set(Box b){
		b.i = 7;
	}
	void set2(Box b){
		b = new Box();
		b.i = 8;
	}
}