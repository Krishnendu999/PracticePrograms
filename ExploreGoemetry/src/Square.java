public class Square extends Shapes {
	public int Area() {
		return (Shapes.length * Shapes.breadth);
	}

	public boolean CheckSquare() {
		if (Shapes.length == Shapes.breadth) {
			 this.setCheck(true);
					return true;

		} else {
			this.setCheck(false);
			return false;
		}
	}
}
