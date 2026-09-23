

public class Program {
	
	public static int totalSides(RegularPolygon[] polygons) {
		int total = 0;
		for(int  i = 0 ; i < polygons.length ; i++) {
			total = total + polygons[i].getNumSides();
		}
		return total;
	}

	public static void main(String[] args) {
		EquilateralTriangle  t1 = new EquilateralTriangle(5);
		Square s1 = new Square(8);
		
		System.out.println("EquilateralTriangle : ");
		System.out.println("Number of sides : " + t1.getNumSides());
		System.out.println("Side length : " + t1.getSideLength());
		System.out.println("Perimeter : " + t1.getPerimeter());
		System.out.println("Interior Angle : " + t1.getInterior());
		
		System.out.println("===================================");
		
		System.out.println("Square : ");
		System.out.println("Number of side : " + s1.getNumSides());
		System.out.println("Side length : " + s1.getSideLength());
		System.out.println("Perimeter : " + s1.getPerimeter()); 
		System.out.println("Interior Angle : " + s1.getInterior());
		
		
		System.out.println("===================================");
		
		
		RegularPolygon[] polygons = {t1 , s1};
		
		System.out.println("\n Total number of the sides : " + totalSides(polygons));
		
		

	}

}
