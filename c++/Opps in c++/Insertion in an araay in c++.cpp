#include<iostream>
using namespace std;

void display(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int arr[100] = {4, 5, 5, 5, 5}; // Note: Only first 5 elements are initialized

    int size = 5; // Size of the array
    display(arr, size); // Call display function to print the array

    return 0;
}
