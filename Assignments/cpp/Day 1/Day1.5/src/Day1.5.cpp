//============================================================================
// Name        : 5.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Calculate power
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int base ;
	int expo;
	int result = 1;
	cout<<"Enter the base and expo : ";
	cin >> base >> expo ;

	cout << base << "^" << expo << endl ;

	while(expo != 0)
	{
		result = result * base ;
		--expo;
	}

	cout << "result = " << result << endl ;
	return 0;
}
