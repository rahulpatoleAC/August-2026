//Print the sum, difference and product of two complex numbers by creating a
//class named 'Complex' with separate methods for each operation whose real and
//imaginary parts are entered by user.

public class Complex {
	int real;
	int imag;
	

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImag() {
		return imag;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}
	
	

	public void display(){
		System.out.println("Complex number : " + real + " + " + imag +  "i");
		
	}
	
	

}
