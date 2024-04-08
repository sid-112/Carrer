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

void main(){
    printf("Welcome To Abdul calculator Brother \n");
    printf("You Could perform many activity here \n");
    int n;
    int p;
    printf("Please enter Number 1 \n");
    scanf("%d", &n);
    printf("Please enter Number 2 \n");
    scanf("%d", &p);
    printf("Select 1 to Add \n 2 to subtract \n 3 to multiply \n 4 to divide \n and 5 to perform mysterious actions");
    int count;
    scanf("%d", &count);
    if (count == 1){
        add(n, p);
    }

    else if(count == 2){
        sub(n, p);
    }

    else if (count == 3){
        mul(n, p);
    }

    else if (count == 4){
        div(n, p);
    }

    else if(count == 5){
        printf("Allah Hu Akbar");
    }
}
