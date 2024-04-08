#include<stdio.h>

int add(int x, int y){
    int z = x + y;
    printf("%d", z);
}

int sub(int x, int y){
    int z = x - y;
    printf("%d", z);
}

int mul(int x, int y){
    int z = x * y;
    printf("%d", z);
}

int div(int x, int y){
    int z = x / y;
    printf("%d", z);
}

int mod(int x, int y){
    int z = x % y;
    printf("%d", z);
}


int main(){
    //Arithmetic Opretors
    add(20, 10);
    sub(20, 10);
    mul(20, 10);
    div(20, 10);
    mod(20, 10);
    return 0;
}

//I know Rest of the Opretors
