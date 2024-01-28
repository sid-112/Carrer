#include<iostream>
using namespace std;

int main() {
    cout << "For loop" << endl;

    for (int i = 1; i < 8; i++) {
        cout << i << endl;
    }

    cout << "-----------------------" << endl;
    cout << "While Loop" << endl;

    int j = 0;
    while(j < 10){
        cout << j << endl;
        j++;
    }

    cout << "-----------------------" << endl;
    cout << "Do-While Loop" << endl;

    int k = 1;

    do {
        cout << k << endl;
        k++;
    } while(k < 10); // Corrected this line

    cout << k << endl;
    k++;  // Added a newline for clarity

    return 0;
}
