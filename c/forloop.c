#include<stdio.h>

int main(){
	for (int i = 0; i < 11; i++){
        printf("%d \n", i);
	}

	printf("----------------------------------------------- \n");

	for (int j = 11; j > 0; j--){
        printf("%d \n", j);
	}

	printf("----------------------------------------------- \n");

	int k = 0;

	while (k < 11){
        printf("%d \n", k);
        k++;
	}
	printf("----------------------------------------------- \n");

	int l = 11;

	while(k>0){
        printf("%d \n", k);
        k--;
	}

	printf("----------------------------------------------- \n");

	return 0;
}
