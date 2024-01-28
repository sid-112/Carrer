#include<iostream>
using namespace std;

int main(){
    //cout<<"Hello world, 12";
    int a = 3;
    int* b = &a;
    cout<<&a<<endl;
    cout<<b<<endl;
    cout<<"The value of b is "<<*b;
    return 0;
}
