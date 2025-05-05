package package1;

public class Assignment1 {

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

	public int div(int p, int q) {
		int r;
		r = p / q;
		System.out.println("Div result is" + " " + r);
		return r;
	}

	public static void main(String[] args) {

		Assignment1 assign = new Assignment1();

		int sumresult1 = assign.sum(10, 2);
		int sumresult2 = assign.sum(sumresult1, 2);
		int subresult1 = assign.sub(sumresult2, 2);
		int multiresult = assign.mul(subresult1, 2);
		int divresult = assign.div(multiresult, 2);

		System.out.println("Final result is" + " " + divresult);
	}

}
