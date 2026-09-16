
public class PrimeMember extends Member {
	String joiningYear;
	float joiningFees;
	boolean isActive = false;
	
//	PrimeMember(String name, int age, int ph_no,String address,float sal,String joiningYear,float joiningFees,boolean isActive){
//		super( name,  age, ph_no, address, sal);
//		
//		this.joiningYear =joiningYear;
//		this.joiningFees =joiningFees;
//		this.isActive =isActive;
//		
//	}
	
	
	public void display() {
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Phone Number : " + getPh_no());
		System.out.println("Address : " + getAddress());
		System.out.println("Salary : " + getSal());
		System.out.println("Joining Year : " + getJoiningYear());
		System.out.println("Joining Fees : " + getJoiningFees());
		System.out.println("Is Active : " + isActive);
	
	}
	
//	
	
	public String getJoiningYear() {
		return joiningYear;
	}
	
	public void setJoiningYear(String joiningYear) {
		this.joiningYear = joiningYear;
	}
	
	public float getJoiningFees() {
		return joiningFees;
	}
	
	public void setJoiningFees(float joiningFees) {
		this.joiningFees = joiningFees;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
//	public void display() {
//		System.out.println("Name : " + getName());
//		System.out.println("Age : " + getAge());
//		System.out.println("Phone Number : " + getPh_no());
//		System.out.println("Address : " + getAddress());
//		System.out.println("Salary : " + getSal());
//		System.out.println("Joining Year : " + joiningYear);
//		System.out.println("Joining Fees : " + joiningFees);
//		System.out.println("Is Active : " + isActive);
//	
//	}
	
}
