public class Brain {

	static int n;
	private int[] ActualArray = new int[n];

	public int[] getActualArray() {
		return ActualArray;
	}

	public void setActualArray(int[] actualArray) {
		ActualArray = actualArray;
	}

	int[] Compute() {
		int temp;
		if (n > 1) {
			for (int i = 1; i < ActualArray.length; i++) {
				int count = i;

				for (int j = i - 1; j >= 0; j--) {

					if (ActualArray[count] < ActualArray[j]) {
						temp = ActualArray[count];
						ActualArray[count] = ActualArray[j];
						ActualArray[j] = temp;
						count = j;
					}

				}
				System.out.println(java.util.Arrays.toString(ActualArray));

			}

		}

		return ActualArray;
	}

}