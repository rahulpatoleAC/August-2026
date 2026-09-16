
public class Square extends Rectangle {
	float side;

	
	
	Square(float length,float breadth,float side){
		super(length,breadth);
		this.side = side;
	}
	
	public float area() {
		return side * side;
	}
	
}
