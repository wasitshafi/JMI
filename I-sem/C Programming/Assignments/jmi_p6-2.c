//
//jmi_p6-2.c on 12-08-18
//
//program to ...
#include <stdio.h>

struct employee{
     char name[20];
	 int w_hr;
	 int gross_pay;
};

int main()
{
	int i, n, rate_phr;
    char buffer[255];

	do{
		 printf("\nEnter no of employee : ");
		 scanf("%d", &n);

		 if( n < 1 )
			printf("\nInvalid Input...! Try Again");
	  }while( n < 1 );

	struct  employee emp[10];
	do{
	 	 printf("Enter rate/hr : ");
		 scanf("%d", &rate_phr);

		 if(rate_phr < 1)
			printf("\nInvalid Input...! Try Again");
 	  }while(rate_phr < 1);

	for( i = 0; i < n; i++ )
	{
		printf("\nEnter name of employee %d :", i + 1);
		fgets(buffer, sizeof(buffer), stdin); // clearing input stream
		scanf("%[^\n]", emp[i].name);

		do{
			printf("Enter total working hours of %s : ", emp[i].name );
			scanf("%d", &emp[i].w_hr);
			if( emp[i].w_hr < 1 ) printf("\nInvalid Input...! Try Again");
		  }while( emp[i].w_hr < 1 );

		if(emp[i].w_hr <= 40)
			emp[i].gross_pay = emp[i].w_hr * rate_phr;
		else
		{
			int excess = emp[i].w_hr - 40;
			emp[i].gross_pay = 40 * rate_phr + (excess * rate_phr) / 2;
		}
	}

	for( i = 0; i < n; i++ )
	{
		printf("\n************");
		printf("\n*Name      *  %s", emp[i].name);
		printf("\n*Gross Pay *  %d", emp[i].gross_pay);
	}
    printf("\n************");
	return 0;
}