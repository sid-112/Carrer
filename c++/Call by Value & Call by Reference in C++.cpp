#include<iostream>
using namespace std;

void swap(int* a, int* b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main(){
    int a = 6, b = 7;

    cout << "Before swapping: a = " << a << ", b = " << b << endl;

    swap(&a, &b);

    cout << "After swapping: a = " << a << ", b = " << b << endl;

    return 0;
}
