class StackHeapA{
	public static void main(String[] args){
		int a = 1;
		Box b = new Box();
		System.out.println(b.i);
		b.set(a);
		System.out.println(b.i);
		b.set2(b);
		System.out.println(b.i);
		b.set3(b);
		System.out.println(b.i);
	}
}

class Box{

	int i;
	void set(int x){
		x = 2;
	}
	void set2(Box b){
		b.i = 3;
	}
	void set3(Box b){
		b = new Box();
		b.i = 4;
	}
}