package _02_gotta_catchem_all;

public class ExceptionMethods {

	public static double divide(double numerator, double denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException();
		} else {
			return numerator / denominator;
		}
	}
	
	public static String reverseString(String s) {
		if(s.isEmpty()) {
			throw new IllegalStateException();
		}
		String reversed = "";
		for (int i = s.length()-1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
	}
}
