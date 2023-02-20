package java8;

interface Interf {
	public void m1(int i);
}

class Test {
	public void m2(int i) {
		System.out.println("From Method Reference:" + i);
	}

	public static void main(String[] args) {
		Interf f = I ->System.out.println("From Lambda Expression:" + I);
		//f.m1(10);
		Test t = new Test();
		Interf i1 = t::m2;
		i1.m1(20);
	}
}