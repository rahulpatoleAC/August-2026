//============================================================================
// Name        : 6.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Swapping of two number without using 3rd variable
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int a = 10;
	int b = 5;

	a = a + b;
	b = a - b;
	a = a - b;

	cout << "Swapping value are : " << endl;

	cout << "a = " << a  << endl ;
	cout << "b = " << b  << endl ;


	return 0;
}
