#include<iostream>
using namespace std;

int main(){
    for (int i = 0; i < 4; i++){
        cout<<i<<endl;
        if (i == 8){
            break;
        }

        else{
            continue;
        }
    }
    return 0;
}
