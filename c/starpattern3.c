#include <stdio.h>

void main() {
  int n = 5;
  for (int i = n; i > 0; i--) {
    for (int j = 0; j < n - 1; j++) {
      printf("*");
    }
    printf("\n");
  }
}

//*****
//****
//***
//**
//*
