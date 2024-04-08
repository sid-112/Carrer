#include <stdio.h>
#include <stdbool.h>

void main() {
  while (true) {
    printf("Welcome To Abdul calculator Brother \n");
    printf("You Could perform many activity here \n");

    int n;
    int p;
    char a;

    printf("Please enter Number 1 \n");
    scanf("%d", &n);
    printf("Please enter Number 2 \n");
    scanf("%d", &p);

    printf("Select 1 to Add \n 2 to subtract \n 3 to multiply \n 4 to divide \n and 5 to perform mysterious actions");
    int count;
    scanf("%d", &count);

    if (count == 1) {
      printf("%d", n + p);
    } else if (count == 2) {
      printf("%d", n - p);
    } else if (count == 3) {
      printf("%d", n * p);
    } else if (count == 4) {
      printf("%d", n / p);  // Consider using float for division if decimals are needed
    } else if (count == 5) {
      printf("Allah Hu Akbar");
    }

    printf("TO continue Select y or select n to not continue");
    scanf(" %c", &a);  // Add a space before %c to consume newline character

    if (a == 'y') {
      continue;
    }
    else {
        break;
    }
  }
}
