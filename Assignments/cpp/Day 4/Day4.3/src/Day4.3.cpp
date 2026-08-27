//============================================================================
// Name        : 3.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Building Sensor Grid
//============================================================================

#include <iostream>
using namespace std;

int main() {
	float arr[3][3];
	cout << "Grid reading : " << endl;
//	Read temperatures for all 9 rooms into a 2D array (rows = floors, columns = rooms)
	for(int i = 0 ; i < 3 ; i++){
		for(int j = 0 ; j < 3 ; j++){
			cin >> arr [i][j] ;
		}
	}
//	Display the readings in a formatted table
	for(int i = 0 ; i < 3 ; i++){
		cout << "Floor " <<" " << i + 1 <<" : ";

			for(int j = 0 ; j < 3 ; j++){
				cout << arr [i][j] << " " ;
			}
			cout << endl;
		}

//	Find and report the hottest room (floor and room number)
	float hottest = arr[0][0];
	int hotFloor = 0;
	int hotRoom = 0;
	for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				if(arr[i][j] > hottest){
					hottest = arr[i][j];
					hotFloor = i;
				    hotRoom = j;
			}
		}
	}
	cout << "Hottest Room :" << "Floor " << hotFloor + 1 <<" , ";
	cout <<"Room " << hotRoom + 1 << " -> " << hottest  << endl;

//	Find and report the floor with the highest average temperature
	float average ;
	float highestAverage  ;

	for(int i = 0 ; i < 3 ; i++){
		float sum = 0;
			for(int j = 0 ; j < 3 ; j++){
				sum = sum + arr[i][j];
				 average  = sum /3 ;

			}
			average = sum /3 ;


			if(average > highestAverage){
				highestAverage = average;
				 hotFloor = i;
			 }
		}

	cout << "Hottest Floor : " << "Floor " << hotFloor + 1 << " " << "("<< highestAverage << ")" <<endl;

//	Count total rooms at or above the WARNING threshold (30°C)
	int count = 0;
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			if(arr[i][j]>=30){
				count++;
			}
		}
	}
	cout << "Rooms at WARNING or above " << count << endl ;

	return 0;
}
