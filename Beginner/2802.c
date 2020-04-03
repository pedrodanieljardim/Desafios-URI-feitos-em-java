
#include <stdio.h>

long long binomio(int a, int b);
long long fat(int n);

/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  29/02/2020			  |
*   ----------------------------------
*
*/



void main ()
{

	int a;

	scanf("%d", &a);

	printf("%lld\n", 1 + binomio(a, 2) + binomio(a, 4));

}

long long binomio(int a , int b)
{


	unsigned short i;
	long long retorno = 1;

	for (i = 0; i < b; ++i)
		retorno *= a - i;

	return retorno / fat(b);

}

long long fat(int n)
{

	long long retorno = 1;

	while (n > 1)
		retorno *= n--;

	return retorno;

}
