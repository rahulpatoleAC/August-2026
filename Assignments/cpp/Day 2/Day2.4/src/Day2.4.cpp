//============================================================================
// Name        : 4.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Calculate power
//============================================================================

#include <iostream>
using namespace std;
int power(int a,int b){
	int result = 1;
	while(b != 0){
		result = result * a;
		--b;
	}
	return result;

}
int main() {

	int base;
	cout << "base = " ;
	cin >> base ;
	int expo;
	cout << "expo = " ;
	cin >> expo ;

	int result = power(base,expo);
	cout << "Power =" << result;

	return 0;
}
