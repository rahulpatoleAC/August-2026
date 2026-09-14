/*Write a program to print the area and perimeter of a triangle having sides of 3, 4
and 5 units by creating a class named 'Triangle' with constructor having the three
sides as its parameters.

*/
public class Triangle {
	int side1 ;
	int side2 ;
	int side3 ;
		
	Triangle(int side1,int side2,int side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
		
	public int Area() {
		
		int Area = (side1*side2)/2;
		
		return Area;
		
	}
	
	public int Perimeter() {
		
		int Perimeter = side1 + side2 + side3;
		
		return Perimeter;
	}
	
	
}
