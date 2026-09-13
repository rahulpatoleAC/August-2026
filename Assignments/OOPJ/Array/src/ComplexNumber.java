
public class ComplexNumber {
	int num1;
	int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void displayComplex() {
		System.out.println("Complex number : " + num1 + " + " + num2 + "i");
		
	}
	
	public int  ComputeComplexNumber() {
		
		int multiplication  = num1 * num2;
		
		return multiplication;
	}
	
}
