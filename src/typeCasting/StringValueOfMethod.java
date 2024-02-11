package typeCasting;

public class StringValueOfMethod {

	public static void main(String[] args) {
		
		int value = 30;
		String text = String.valueOf(value);
		
		System.out.println(text + 50);
		
		
		boolean a = true;
		boolean b = false;
		
		String tr = String.valueOf(a);
		String tr1 = String.valueOf(b);
		System.out.println(tr);
		System.out.println(tr1);

	}

}
