
class EquilateralTriangle implements RegularPolygon {

	private double sidelength;

	EquilateralTriangle(double sideLength) {
		this.sidelength = sideLength;
	}

	public int getNumSides() {
		return 3;
	}

	public double getSideLength() {
		return sidelength;
	}

}