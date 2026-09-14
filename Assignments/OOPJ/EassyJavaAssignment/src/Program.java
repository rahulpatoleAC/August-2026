
public class Program {
	
	public static void main(String[] args) {
		
//		Triangle t1 = new Triangle(3,4,5);
//		System.out.println("Area of  triangle : " + t1.Area());
//		System.out.println("Perimeter of  triangle : " + t1.Perimeter());
//		
//		
//		
//		TwoRectangle r1 = new TwoRectangle(4,5);
//		System.out.println("Area of  Rectangle : " + r1.Area());
//		
//		TwoRectangle r2 = new TwoRectangle(5,8);
//		System.out.println("Area of  Rectangle : " + r2.Area());
//	
//		
//		Complex c1 = new Complex();
//		
//		System.out.println("Enter the real number : ");
//		int real = ConsoleInput.getInt();
//		c1.setReal(real);
//		System.out.println("Enter the imag number : ");
//		int imag = ConsoleInput.getInt();
//		c1.setImag(imag);
//		c1.display();
	
		Employee e1 = new Employee("Robert" , 2025 ,"64C-WallsStreat");
		Employee e2 = new Employee("Sam" ,  2000 ,"68D- WallsStreat");
		Employee e3 = new Employee("John", 1999, " 26B- WallsStreat");

		e1.display();
		e2.display();
		e3.display();
		
		e1.setSal(400);
		e1.setHours(8);
		
		e1.addSal();
		e1.addWork();
		
		e1.getInfo();
		
		
		
	}

}
