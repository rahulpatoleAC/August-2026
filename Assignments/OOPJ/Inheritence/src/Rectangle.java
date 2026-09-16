
public class Rectangle {
	
	float length;
	float breadth;
	
	
	
	Rectangle(float length,float  breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public float area(){
		return length * breadth;
	}
	
	public  float perimeter() {
		return 2*(length + breadth);
	}
	

	
}
