//============================================================================
// Name        : 3.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Swap two numbers
//============================================================================

#include <iostream>
using namespace std;

void swap(int &a,int &b){
	int temp = a;
	a = b;
	b = temp;
}
int main() {
	int a ;
	cout << "Taking input a = ";
	cin >> a ;
	int b ;
	cout << "Taking input b = ";
	cin >> b ;

	swap(a,b);

	cout << " a = " << a << endl;
	cout << " b = " << b << endl;
	return 0;
}
