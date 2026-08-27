//============================================================================
// Name        : 1.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Sensor Reading Classified
//============================================================================

#include <iostream>
using namespace std;

int main() {

	double temp ;
	cout << "Enter the temperature : ";
	cin >> temp;

	int statuscode;

	if(temp < 0){
		statuscode = -1;
	}
	else if(temp <=29 ) {
		statuscode = 0;
	}
	else if(temp <= 44){
		statuscode = 1;
	}
	else if(temp <= 59){
		statuscode = 2;
	}
	else{
		statuscode = 3;
	}

	switch(statuscode){
		case -1 :
			cout << " SENSOR_ERROR "<< endl;
			cout << "Sensor fault- check wiring" << endl;
			break;

		case 0 :
			cout << "NORMAL" << endl ;
			cout << "No action required " << endl ;
			break;

		case 1 :
			cout << "WARNING" << endl;
			cout << "Alert sent to supervisor " << endl;
			break;

		case 2 :
			cout << "CRITICAL" << endl;
			cout << "Cooling system triggered " << endl;
			break;

		case 3 :
			cout << "SHUTDOWN" << endl;
			cout << "Emergency shutdown initiated";
			break;
	}

	cout << "Temperature level :" << endl;
	cout << ( temp >= 25 ? " Above Average ": "Below Average ");

	double fahrenheit = (temp * 9 / 5) + 32;

	cout <<"Fahrenheit = "  << fahrenheit << endl ;
	return 0;
}
