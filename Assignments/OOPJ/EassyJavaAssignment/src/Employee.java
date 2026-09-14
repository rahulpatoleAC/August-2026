//Write a program that would print the information (name, year of joining, salary,
//address) of three employees by creating a class named 'Employee'. The output
//should be as follows:
//Name Year of joining Address
//Robert 1994 64C- WallsStreat
//Sam 2000 68D- WallsStreat
//John 1999 26B- WallsStreat

//Write a program by creating an 'Employee' class having the following methods
//and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee
//as parameter
//2 - 'addSal()' which adds $10 to salary of the employee if it is less than $500.
//3 - 'addWork()' which adds $5 to salary of employee if the number of hours of
//work per day is more than 6 hours.

public class Employee {

	String name;
	int YOJ;
	float sal;
	String address;
	int hours;
	
	
	
	
	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
	public void getInfo() {
		System.out.println(sal);
		System.out.println(hours);
	}

	Employee(String name, int YOJ,String address){
		this.name = name;
		this.YOJ = YOJ;
		this.address = address;
		
	}
	
	public void addSal() {
		if(sal<500) {
			sal += 10;
		}
		
	}
	
	public void addWork() {
		if(hours > 6) {
			sal += 5;
		}
	}
	
	public void display() {
		System.out.println(name + " " + YOJ + " " + address);
	}
}
