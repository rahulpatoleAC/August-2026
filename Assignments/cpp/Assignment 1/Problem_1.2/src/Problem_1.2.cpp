//============================================================================
// Name        : 2.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Sensor Log Buffer
//============================================================================
//1.
//Accept
//N
//from the user (1 ≤ N ≤ 100), then read N temperature values into an array
//2.
//Print all valid readings — skip values below 0 (sensor error) using
//continue
//3.
//Scan for the
//first reading at or above 45°C
//— print its index and stop scanning using
//break
//4.
//Compute min, max, and average in
//one single loop pass
//5.
//Count readings per category: Normal / Warning / Critical / Shutdown
#include <iostream>
using namespace std;

int main() {
	int size;
	cout << "size =" ;
	cin >> size ;

	double arr[size];

//Accept N from the user (1 ≤ N ≤ 100), then read N temperature values into an array
	cout << "enter temperature : ";
	for(int i = 0;i<size ; i++){
		cin >> arr[i]  ;
	}

	cout << "Enter Reading : " ;
	for(int i = 0; i<size ; i++){
		if(arr[i] <0)
		{
			continue;
		}
		cout << arr[i] << " ";
	}

	bool found = false;
	for(int i = 0 ; i<size ; i++){
		if(arr[i]>=45){
			cout << "First reading : " << arr[i]  << endl;
			cout << " index = " << i << endl;
			found = true;
			break;
	}
		cout << endl ;

	if(arr[i] >= 45){
		cout << "first Critical : " << arr[i] ;
		cout << "Index " << i << endl;
		break;
	}
	cout << endl;
	}

	double min = arr[0];
	double max = arr[0];
	double sum = 0 ;
	for(int i = 0 ; i < size; i++ ){
		if(arr[i]<0){
			continue;
		}

		if(arr[i]<min){
			min = arr[i];
		}

		if(arr[i]>max){
			max = arr[i];
		}

		if(arr[i]>0){
		sum  = sum + arr[i];
		}
	}
	double average  = sum/size;
	cout << "Minimum = " << min << endl ;
	cout << "Maximum = " << max << endl ;
	cout << "Average = " << average << endl ;

	int normal = 0;
	int warning  = 0;
	int critical = 0;
	int shutdown = 0;

	for(int i = 0 ; i<size ;i++){
		if(arr[i] >=0 && arr[i]<=29){
			normal++;
		}
		else if (arr[i] >= 30 && arr[i] <= 44){
			warning++;
		}
		else if(arr[i] >= 45 && arr[i] <= 59){
			critical++;
		}
		else{
			shutdown++;
		}
	}
	    cout << "Normal = " << normal <<" " ;
		cout << "Warning =  " << warning <<" ";
		cout << "Critical = " << critical <<" ";
		cout << "Shutdown = " << shutdown <<" ";


	return 0;
}
