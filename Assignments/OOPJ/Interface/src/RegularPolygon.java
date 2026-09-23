
public interface RegularPolygon {

	int getNumSides();

	double getSideLength();

	default double getPerimeter() {
		return getNumSides() * getSideLength();
	}
	
	default double getInterior(){
		return ((getNumSides() - 2) * 3.14) /getNumSides();
	}

}