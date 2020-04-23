//
//jmi_p52.c
//
//program to generate pay silp of employee

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

#define income_tax_rate 15
#define da_rate 10
#define house_rent_allowance 3000
struct employee{
                int id;
                char name[10];
                int basic_salary;
                int hra;
                int da;
                int income_tax;
                int net_salary;
};

void get_data(struct employee emp[], int i) // *emp == emp[]
{
    char buffer[255];

    printf("\nEnter employee %d name : ", i + 1);
    fgets(buffer, sizeof(buffer), stdin);

	scanf("%[^\n]", emp[i].name);

	printf("Enter \'%s\' id : ", emp[i].name);
    fgets(buffer, sizeof(buffer), stdin);
	scanf("%d", &emp[i].id);

	printf("Enter \'%s\' basic salary : ",emp[i].name);
    fgets(buffer, sizeof(buffer), stdin);
	scanf("%d", &emp[i].basic_salary);

	emp[i].hra = house_rent_allowance;
	emp[i].da = emp[i].basic_salary * da_rate / 100;
    emp[i].income_tax = ( emp[i].basic_salary + emp[i].da + emp[i].hra ) * income_tax_rate / 100;
	emp[i].net_salary = (emp[i].basic_salary + emp[i].da + emp[i].hra) - emp[i].income_tax;
}

void put_data(struct employee *emp, int i)
{
    FILE *fptr_emp_pay_silp, *fptr_emp_data;
	char file_name[20];

	printf("\n%s\t%d\t%d",emp[i].name, emp[i].id,emp[i].net_salary); // printing data on console

	itoa(emp[i].id, file_name, 10);   //integer to ascii

	strcat(file_name, "_");
	strcat(file_name, emp[i].name);
	strcat(file_name, ".txt");    //file_name = empid_empname.txt

    fptr_emp_pay_silp = fopen(file_name, "a"); // for each employee
	fptr_emp_data = fopen("employee_data.txt", "a"); //to store all employee details

	fprintf(fptr_emp_data, "************* Pay Silp of %s **************",emp[i].name);
	fprintf(fptr_emp_data, "\nEmployee id: %d \nBasic salary :%d\nHRA :%d\nDA: %d\nIncome tax: %d\nTotal salary: %d\n", emp[i].id, emp[i].basic_salary, emp[i].hra, emp[i].da, emp[i].income_tax, emp[i].net_salary);


	fprintf(fptr_emp_pay_silp, "************* Pay Silp of %s **************",emp[i].name);
    fprintf(fptr_emp_pay_silp, "\nEmployee id: %d \nBasic salary :%d\nHRA :%d\nDA: %d\nIncome tax: %d\nTotal salary: %d", emp[i].id, emp[i].basic_salary, emp[i].hra, emp[i].da, emp[i].income_tax, emp[i].net_salary);
    fprintf(fptr_emp_pay_silp, "\n***************************");
}

void print_heading()
{
    int i;
 	printf("\n\nEmployee data are as follows :\n\n");

	for(i = 0 ; i < 23 ; i++, printf("*"));
	printf("\n*NAME\tID\tSALARY*\n");
	for(i = 0 ; i < 23 ; i++, printf("*"));
    printf("\n");
}

int main()
{
    struct employee *emp;
    int n, i;

	printf("Enter no of employee : ");
    scanf("%d", &n);

    emp = (struct employee *) malloc (n * sizeof(struct employee));
    for( i = 0 ; i < n ; i++ )
    get_data(emp, i);

    print_heading();
  	for( i = 0 ; i < n ; i++ ) put_data(emp, i);

	return 0;
}