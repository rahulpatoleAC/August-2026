//============================================================================
// Name        : 2.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Area of circle calculation
//============================================================================

#include <iostream>
using namespace std;

float areaOfCircle(int r){
	float area = 3.14*r*r;
	return area;
}
int main() {
	int r ;
	cout << "Enter the radius of circle : ";
	cin >> r ;
	float area = areaOfCircle(r);
	cout << "Area = " << area ;
	return 0;
}
