public class Machine {

	private double numberOne;
	private double numberTwo;
	final String Action;
	private double result;

	public double getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(double numberOne) {
		this.numberOne = numberOne;
	}

	public double getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(double numberTwo) {
		this.numberTwo = numberTwo;
	}

	public Machine(double firstint, double secondint, String inputoperation) {
		this.numberOne = firstint;
		this.numberTwo = secondint;
		Action = inputoperation;

		switch (Action) {
		case "A":
			result = loadAdd(this.numberOne, this.numberTwo);
			System.out.println(result);
			break;
		case "S":
			result = loadSubs(this.numberOne, this.numberTwo);
			System.out.println(result);
			break;
		case "M":
			result = loadMultiply(this.numberOne, this.numberTwo);
			System.out.println(result);
			break;
		case "E":
			System.out.println("JVM exited. Restart to use again");
			break;
		default:
			System.out
					.println("Invalid Option. JVM exited. Restart to use again");
			break;

		}

	}

	double loadAdd(double numberOne, double numberTwo) {
		result = numberOne + numberTwo;
		return result;
	}

	double loadSubs(double numberOne, double numberTwo) {
		result = numberOne - numberTwo;
		return result;
	}

	double loadMultiply(double numberOne, double numberTwo) {
		result = numberOne * numberTwo;
		return result;
	}

}
/*end*/
