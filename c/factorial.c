#include <stdio.h>

int factorial(int n) {
    if (n == 0) {
        return 1;
    } else if (n < 0) {
        printf("Beta Rehende Tumse na Hopayega \n");
        return -1;
    } else {
        return n * factorial(n - 1);
    }
}

int main() {
    int num = 5;
    int fact = factorial(num);

    if (fact == -1) {
        printf("Nikal");
    } else {
        printf("The factorial of %d is %d\n", num, fact);
    }

    return 0;
}
