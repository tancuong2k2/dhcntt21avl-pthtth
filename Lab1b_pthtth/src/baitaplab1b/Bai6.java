package baitaplab1b;

public class Bai6 {
	public static void main(String[] args) {
		C c = new C();
		c.x = 30; // gán cho C.x
		c.setAX(10); // gán cho A.x
		c.printAll();
	}
}

class A {
	int x;
}

class B extends A {
	int x;
}

class C extends B {
	int x;

	public void setAX(int value) {
		((A) this).x = value; // gán cho A.x
	}

	public void printAll() {
		System.out.println("A.x = " + ((A) this).x);
		System.out.println("B.x = " + super.x);
		System.out.println("C.x = " + this.x);
	}
}
