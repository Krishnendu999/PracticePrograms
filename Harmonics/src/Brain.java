public class Brain {

	static int range;

	double calculate() {
		double sum = 0;
		for (double n = 1; n <= Brain.range; n++) {

			sum = sum + (double) (1 / n);

		}

		return sum;

	}
}
