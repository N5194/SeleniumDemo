package InheritanceDemo;

public class A {

	int x = 7;
	static int a =11;

	{
		System.out.println("Instance block of A");
	}

	static {

		System.out.println("Static block of A");

	}

	public void m1() {
		int y = 10;
	}

//	private A() {
//		super();
//	}

}
