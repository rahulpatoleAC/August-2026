//============================================================================
// Name        : 3.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Swap two numbers with temp
//============================================================================

#include <iostream>
using namespace std;

int main() {

	int a = 10;
	int b = 20;

	int temp = a;
	a = b;
	b = temp;

	cout << "After Swapping :" << endl;
	cout << "a = " << a << endl;
	cout << "b = " << b << endl;

	return 0;
}
