//============================================================================
// Name        : 6.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description :  Swapping of two number without using 3rd variable
//============================================================================

#include <iostream>
using namespace std;
 void swap(int &a,int &b){
	 a = a + b;
	 b = a - b;
	 a = a - b;
 }
int main() {
	int a ;
	cout << "a = ";
	cin >> a ;
	int b;
	cout << "b = ";
	cin >> b ;
	cout << "Before Swapping " << endl;

	swap(a , b);

	cout << "After Swapping " << endl;
	cout << "a = " << a << endl ;
	cout << "b = " << b << endl ;

	return 0;
}
