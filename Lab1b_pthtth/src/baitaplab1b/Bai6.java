package baitaplab1b;

public class Bai6 {
	class A {
	    int x;
	}

	class B extends A {
	    int x;
	}

	class C extends B {
	    int x;

	    public void setXofA(int value) {
	        super.x = value; // truy cập x của A qua super
	    }
	}

}
