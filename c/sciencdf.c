#include<stdio.h>
#include <stdbool.h>

int main(){
    while(true){
        float speed;
        float time;
        float iVel;
        float fVel;
        float vf;
        float av;
        float a;
        int n;
        int q;

        printf("Hello Welcome press 1 for v 2 for av and 3 for a");
        scanf("%d", &n);

        if(n == 1){
            printf("You hAve selected Velocity");
            scanf("%f", &speed);
            scanf("%f", &time);
            vf = (speed/time);
            printf("%f", vf);
        }

        if(n == 2){
            printf("You hAve selected Average Velocity");
            scanf("%f", &iVel);
            scanf("%f", &fVel);
            av = (iVel + fVel)/2;
            printf("%f", av);
        }

        if(n == 3){
            printf("You hAve selected SOmething");
            scanf("%f", &fVel);
            scanf("%f", &iVel);
            scanf("%f", time);
            a = (fVel - iVel)/ time;
            printf("%f", a);
        }

        printf("Press 1 to continue and 0 to exit");
        scanf("%d", &q);

        if (q==1){
            continue;
        }

        else{
            break;
        }


        return 0;
    }
}











//Three formulas are
//1) v = s/t
//2) average velocity = (u + v)/2
//3) a = (v - u)/t
