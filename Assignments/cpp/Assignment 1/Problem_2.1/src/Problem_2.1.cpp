//============================================================================
// Name        : 1.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : The Bug in Sensor Recalibration
//============================================================================
/*
  Call all three from main(). Print values before and after each call.
  Write a comment block (minimum 4 lines)inside main() explaining why V1 fails.
 */
#include <iostream>
using namespace std;
void resetSensorPairV1(int reading1,int reading2){

	int temp = reading1;
	reading1 = reading2;
	reading2 = temp;
}

void resetSensorPairV2(int& reading1,int& reading2){

		int temp = reading1;
		reading1 = reading2;
		reading2 = temp;
}

void resetSensorPairV3(int* reading1,int* reading2){

		int temp = *reading1;
		*reading1 = *reading2;
		*reading2 = temp;
}

int main() {
	int A = 55;
	int B = 12;

	cout << "--- V1: Call by Value ---" << endl;
	cout << "Before Swap : " << "A = " << A << " B = " << B << endl;
	resetSensorPairV1(A,B);
	cout << "After Swap : " << "A = " << A << " B = " << B << endl;
	/*
	 As the Function Activation Record (FAR) of each function  is created on the stack .
	 the main() function and resetSensorPairV1()  function FAR is also created on the stack .
	 now very first the function of main() is generated on the stack in that we are passing the value to the resetSensorPairV1()
	 function to that now the value will be go the resetSensorPairV1() function which has his own FAR when the program is executed
	 in the resetSensorPairV1() function FAR the program will work fine but when the function scope end the FAR is destroyed
	 due to that the  value of A and B remain unchanged in these case */

	cout << endl;

	cout << "--- V2: Call by Reference ---" << endl;
	cout << "Before Swap : " << "A = " << A << " B = " << B << endl;
	resetSensorPairV2(A,B);
	cout << "After Swap : " << "A = " << A << " B = " << B << endl;

	cout << endl;

	cout << "--- V3: Call by Pointer ---" << endl;
	cout << "Before Swap : " << "A = " << A << " B = " << B << endl;
	resetSensorPairV3(&A,&B);
	cout << "After Swap : " << "A = " << A << " B = " << B << endl;

	cout << endl;
	return 0;
}
