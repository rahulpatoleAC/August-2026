//============================================================================
// Name        : 3.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Hardware Register Access
//============================================================================

#include <iostream>
using namespace std;

int main() {

	int	statusReg =0b10110001;	// Read-only from firmware side
	int controlReg = 0b00000000	;	// Firmware writes here
	int	dataReg =	0b11001010	;// For reassignment demo

	const int* regptr1 = &statusReg;
	cout << *regptr1<<endl;
	// new value
//	*regptr1 = 0b11001010; // error
//	cannot change the value because of const int* ptr
//	in these the integer value is constant and so we cant change it but we can change the address
	regptr1 = &dataReg; // successful
//  repointing is possible in these the integer value is constant and so we cant change it but we can change the address

	int* const regptr2 = &controlReg;
	cout << *regptr2<<endl;

	*regptr2 = 0b10110001; // successful
//	in these the address is constant and value is not constant so we can change the value
//	regptr2 = &statusReg; // error
	//	in these the address is constant and value is not constant so we can change the value

	const int* const regptr3 = &dataReg;
	cout << *regptr3<<endl;

//	*regptr3 = 0b00000000; // error
//	in these the value and address is constant so we cant change the address and the value
//	regptr3 = &statusReg; // error
//	in these the value and address is constant so we cant change the address and the value


	return 0;
}
