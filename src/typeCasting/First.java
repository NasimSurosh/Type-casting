package typeCasting;

public class First {

	public static void main(String[] args) {
		
		int x = 7;
		long y = x;
		float z = y;
		System.out.println("int value: "+ x);
		System.out.println("int value: "+ y);
		System.out.println("int value: "+ z);
		
		
		System.out.println("Narrowing" + "\n");
		double a = 6.8;
		long b = (long) a;
		int c = (int) b;
		System.out.println("double value: " + a);
		System.out.println("long value: " + b);
		System.out.println("int value: " + c);

	}

}
