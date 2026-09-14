
/*Create a class named 'Student' with String variable 'name' , integer variable
'roll_no'., String variable ‘phone_no’ and String variable ‘address’
a. Assign the value of roll_no as '2' and that of name as "John" by creating an
object of the class Student.
b. Assign and print the roll number, phone number and address of two students
having names "Sam" and "John" respectively by creating two objects of class
'Student'.
*/
public class Student{
	String name;
	int roll_no;
	String address;
	String phone_no;
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "John";
		s.roll_no = 2;
		
		System.out.println("Name : " + s.name);
		System.out.println("Roll no : " + s.roll_no);
		
		Student s1 = new Student();
		s1.name = "Sam";
		s1.roll_no = 33;
		s1.address = "Pune";
		s1.phone_no = "1234567890";
		
		System.out.println("Name : " + s1.name);
		System.out.println("Roll no : " + s1.roll_no);
		System.out.println("Phone no : " + s1.phone_no);
		System.out.println("Address : " + s1.address);

		
		Student s2 = new Student();
		s2.name = "John";
		s2.roll_no = 44;
		s2.address = "Pune";
		s2.phone_no = "1122334455";
		
		System.out.println("Name : " + s2.name);
		System.out.println("Roll no : " + s2.roll_no);
		System.out.println("Phone no : " + s2.phone_no);
		System.out.println("Address : " + s2.address);
		

		
	}
	
	
}
