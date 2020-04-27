//
//
//
//
#include<stdio.h>

struct employee{
    char name[20];
    int basic_salary;
    int hra;
    int da;
    int age;
    int total_salary;
};

void get_data(struct employee *emp, int i) 
{
	 printf("\n\n\nEnter employee %d name:\t", i + 1);
     fflush(stdin);
	 gets(emp->name);
	 
	 printf("\nEnter \'%s\' age:\t", emp->name);
	 fflush(stdin);
	 scanf("%d", &emp->age);
	 
	 printf("\nEnter \'%s\' basic salary:\t",emp->name);
	 fflush(stdin);
	 scanf("%d", &emp->basic_salary);
     
	 emp->hra = emp->basic_salary * 5 / 100;
	 emp->da = emp->basic_salary * 10 / 100;
  	 emp->total_salary = emp->basic_salary + emp->da + emp->hra;
}

void put_data(struct employee emp)
{
	printf("\n%s\t%d\t%d",emp.name, emp.age,emp.total_salary); 
}

int main()
{    
    struct employee emp[100];
    
    int n, i;   
	
	printf("\nEnter no of employee:\t");
    scanf("%d", &n);
    
    for( i = 0 ; i < n ; i++ )
    get_data(&emp[i],i);  

    system("cls");
    
    printf("Employee data are as follows:\n\n");
	printf("\nNAME\tAge\tSALARY\n");
	printf("\n\n");

 	for( i = 0 ; i < n ; i++ )
	 put_data(emp[i]);
     
 	
	return 0;
}

