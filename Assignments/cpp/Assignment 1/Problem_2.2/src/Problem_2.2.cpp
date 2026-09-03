//============================================================================
// Name        : 2.cpp
// Author      : Rahul Patole
// Version     :
// Copyright   : Your copyright notice
// Description : Signal Processing Pipeline
//============================================================================



#include <iostream>
#include <cmath>
using namespace std;

// return square (sum of each element squared) / n)
double computeRMS(double *signal, int n)
{
    double sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum = sum + (*(signal + i) * *(signal + i));
    }

    return sqrt(sum / n);
}

// divide every element by max absolute value int the array (in - phar}
void normalise(double *signal, int n)
{
    double max = 0;
    for (int i = 0; i < n; i++)
    {
        if (abs(*(signal + i)) > max)
        {
            max = abs(*(signal + i));
        }
    }
    for (int i = 0; i < n; i++)
    {
        *(signal + i) /= max;
    }
}

// return count of the position where adjacent element have opposite sign
int countZeroCrossings(double *signal, int n)
{
    int count = 0;
    for (int i = 0; i < (n - 1); i++)
    {
        if (*(signal + i) < 0 && *(signal + i + 1) > 0 || *(signal + i) > 0 && *(signal + i + 1) < 0)
        {
            count++;
        }
    }
    return count;
}

// multiples every element by the gainFactor (in - place)
void applyGain(double *signal, int n, double gainFactor)
{
    for (int i = 0; i < n; i++)
    {
        *(signal + i) *= gainFactor;
    }
}
int main()
{
    int n;
    cout << "Enter the size of the array n : " << endl;
    cin >> n;
    double signal[n];
    cout << "Enter the signal :";

    for (int i = 0; i < n; i++)
    {
        cin >> signal[i];
    }

    cout << "Test Signal : { ";
    for (int i = 0; i < n; i++)
    {
        cout << signal[i];
        if (i < (n - 1))
        {
            cout << ", ";
        }
    }
    cout << " }";

    cout << endl;

    cout << "Normalise signal : {";
    normalise(signal, n);
    for (int i = 0; i < n; i++)
    {
        cout << signal[i];
        if (i < (n - 1))
        {
            cout << ", ";
        }
    }
    cout << "}";
    cout << endl;

    double gainfactor;
    cout << "Enter the gain Factor :";
    cin >> gainfactor;
    cout << " {" ;
    applyGain(signal, n, gainfactor);
    for (int i = 0; i < n; i++)
    {
        cout << signal[i];
        if (i < (n - 1))
        {
            cout << ", ";
        }
    }
    cout << "}";

    cout << endl;

    double RMS = computeRMS(signal, n);
    cout << "RMS : " << RMS << endl;

    int crossing = countZeroCrossings(signal, n);
    cout << "Adjacent element have opposite sign  : " << crossing << endl;
    return 0;
}
