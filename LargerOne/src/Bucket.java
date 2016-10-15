public class Bucket {
	static int Arraywidth;
	int[] myArray = new int[Arraywidth];

	Bucket() {

	}

	int Compute() {

		int CurrentGreatest = myArray[0];

		for (int item : myArray) {
			for (int x = 0; x < Bucket.Arraywidth; x++) {
				if (item < myArray[x]) {
					if (myArray[x] > CurrentGreatest) {
						CurrentGreatest = myArray[x];
					}
				}

			}

		}
		return CurrentGreatest;

	}
}
