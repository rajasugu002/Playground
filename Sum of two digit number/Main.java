#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d",&a);
  b=a%10;
  a=a/10;
  c=b+a;
  printf("%d",c);
  return 0;
}