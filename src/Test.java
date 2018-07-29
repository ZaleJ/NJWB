class parent {
	int i = 20;
	int j = 30;

	void f() {
		System.out.print(" " + i);
	}
}

public class Test extends parent {
	int i = 30;
	int k = 40;

	void f() {
		System.out.print(" " + i);
	}

	void g() {
		System.out.print(" " + k);
	}

	public static void main(String args[]) {
		parent x = new Test();
		System.out.print(x.i);
		x.f();
		Test x1 = (Test) x;
		System.out.print(" " + x1.i);
		x1.f();
	}
}