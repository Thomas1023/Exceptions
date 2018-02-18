package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException();
		}
		return a / b;
	}

	public static String reverseString(String a) {
		System.out.println("started");
		String temp = "";
		System.out.println();
		if (a.equals("")) {
			throw new IllegalStateException();
		} else {
			System.out.println("else");
			for (int i = a.length()-1; i >= 0; i--) {
				temp = temp + a.charAt(i);
				System.out.println(temp);
			}

			System.out.println(temp);
			
			return temp;
		}

	}

}
