
public class Member {
	String name;
	int age;
	int ph_no;
	String address;
	float sal;
	
//	
//	Member(){
//		
//	}
//	Member(String name, int age, int ph_no,String address,float sal){
//		this.name = name;
//		this.age = age;
//		this.ph_no = ph_no;
//		this.address = address;
//		
//	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getPh_no() {
		return ph_no;
	}


	public void setPh_no(int ph_no) {
		this.ph_no = ph_no;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public float getSal() {
		return sal;
	}


	public void setSal(float sal) {
		this.sal = sal;
	}
	
	

	public void printSalary() {
		System.out.println("Salary : " + sal);
	}
	
	
	
}
