#include<stdio.h>

void main(){
    int n = 5;
    for (int i =0; i<n;i++){
        for (int j = 0; j<n;j++){
            if(i+j>=n-1){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        for(int i =0; i<n;i++){
            for(int j = 0; j <i + 1; j++){
                printf("*");
            }
        }
        printf("\n");
    }
}

//    **
//   ****
//  ******
// ********
//**********

