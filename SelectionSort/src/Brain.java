
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
			for (int i = 0; i < (ActualArray.length); i++) {
				for (int j = i + 1; j < ActualArray.length ; j++) {
					if (ActualArray[j] < ActualArray[i]) {
						temp=ActualArray[i];
						ActualArray[i] = ActualArray[j];
						ActualArray[j]=temp;
					} 
				}
				System.out.println(java.util.Arrays.toString(ActualArray));
			}
		} 
		return ActualArray;

	}

}
