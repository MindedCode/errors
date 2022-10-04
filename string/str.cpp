# include <stdio.h>

int main()
{
   char str1[] = "GeeksQuiz";
   char str2[] = {'G', 'e', 'e', 'k', 's', 'Q', 'u', 'i', 'z'};
   int n1 = sizeof(str1)/sizeof(str1[0]);
//   int n2 = sizeof(str2)/sizeof(str2[0]);
   printf("n1 = %d, n2 = ", n1);
   return 0;
}


output of the program:

n1 = 10, n2 = 9
