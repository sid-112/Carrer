#include<iostream>
using namespace std;

struct emp{
        int id;
        char favC;
        float salary;
    };


union school{
    int stdId;
    char Fc;
    float grade;
};


int main(){
    struct emp sid;
    sid.id = 13;
    sid.favC = 'g';
    sid.salary = 56666.89;

    cout<<sid.id<<endl;
    cout<<sid.favC<<endl;
    cout<<sid.salary<<endl;

    cout<<"----------------"<<endl;

    union school sc;

    sc.stdId = 3;
    sc.Fc = 'y';
    sc.grade = 9.7;

    cout<<sc.stdId<<endl;
    cout<<sc.Fc<<endl;
    cout<<sc.grade<<endl;

    cout<<"-----------------"<<endl;

    enum game{
    rock,
    papper,
    sissor
    };

    cout<<rock<<endl;
    cout<<papper<<endl;
    cout<<sissor<<endl;
    return 0;
}
