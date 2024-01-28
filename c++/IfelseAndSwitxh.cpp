#include<iostream>
using namespace std;

int main(){
    int age;
    cout<<"Your age \n";
    cin>>age;
    if (age > 18){
        cout<<"You can't drive car"<<endl;
    }

    else if (age == 18){
        cout<<"You are learing"<<endl;
    }

    else if (18 < age){
        cout<<"You can drive"<<endl;
    }

    switch (age)
    {
    case 18:
        cout<<"hi";
        break;
    
    default:
        cout<<"Bye";
        break;
    }
    return 0;
}