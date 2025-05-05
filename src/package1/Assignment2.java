package package1;

public class Assignment2 {
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
		// TODO Auto-generated method stub
		Assignment2 assignm = new Assignment2();
		int divresult = assignm.div(10, 2);
		int subresult = assignm.sub(divresult, 2);
		int addresult = assignm.sum(subresult, 2);
		int newsubresult = assignm.sub(addresult, 2);
		int multiresult = assignm.mul(newsubresult, 2);
		System.out.println("Final Result is " + " " + multiresult);

	}
}
