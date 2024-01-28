#include<iostream>
using namespace std;

int main() {
    int age[] = {4, 5, 6, 10};

    cout << age[0] << endl;
    cout << age[1] << endl;
    age[2] = 14;
    cout << age[2] << endl;
    cout << age[3] << endl;
    cout<<"----------------------------"<<endl;

    // Use sizeof(age) / sizeof(age[0]) to get the length of the array
    for (int i = 0; i < sizeof(age) / sizeof(age[0]); i++) {
        cout << age[i] << endl;
    }

    cout<<"----------------------------"<<endl;

    int* p = age;
    cout<<*p<<endl;
    cout<<*(p + 1)<<endl;
    cout<<*(p + 2)<<endl;
    cout<<*(p + 3)<<endl;


    return 0;
}
