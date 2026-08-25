//============================================================================
// Name        : 1.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int add(int a,int b)
{
	int add = a + b;
	return add;
}
int main() {

	int a;
	cout << "a = ";
	cin >> a ;

	int b;
	cout << "b = ";
	cin >> b ;

	int result = add(a,b);

	cout << "Add = " << result;

	return 0;
}
