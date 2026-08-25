//============================================================================
// Name        : 5.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Calculate simple interest
//============================================================================

#include <iostream>
using namespace std;

float simpleInterest(int p,int n,float r){

	float si = (p*n*r)/100;
	return si;
}
int main() {
	int p;
	cout << "Enter the principle = ";
	cin >> p;
	int n;
	cout << "Enter the year = ";
	cin >> n;
	float r;
	cout << "Enter the rate = ";
	cin >> r;

	float SI = simpleInterest(p,n,r);
	cout << "Simple Interest = " << SI ;

	return 0;
}
