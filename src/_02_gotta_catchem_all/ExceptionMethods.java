package _02_gotta_catchem_all;

public class ExceptionMethods {

	public static double divide(double numerator, double denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException();
		} else {
			return numerator / denominator;
		}
	}
}
