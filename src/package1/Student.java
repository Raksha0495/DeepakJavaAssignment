package package1;

public class Student {

	public int sum(int a, int b) {
		int c;
		c = a + b;
		System.out.println("Sum result is" + " " + c);
		return c;
	}

	public int sub(int x, int y) {
		int z;
		z = x - y;
		System.out.println("Sub result is" + " " + z);
		return z;
	}

	public int mul(int a1, int a2) {
		int a3;
		a3 = a1 * a2;
		System.out.println("Multi result is" + " " + a3);
		return a3;
	}

	public static void main(String[] args) {
		Student s = new Student();
		int sumresult = s.sum(10, 2);
		int subresult = s.sub(10, 2);
		int mulresult = s.mul(sumresult, subresult);

		System.out.println("Finallll result is " + mulresult);
	}
}
