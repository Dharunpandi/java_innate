#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n,fact=2,count=0,div=1;
    scanf("%d",&n);
    while(n!=1)
    {
        count=0;
            while(n%fact==0)
            {
                n=n/fact;
        count++;
    }
    if(count%2==1)
        div=div*fact;
    fact++;
    }
    printf("%d",div);
        
    return 0;
}
