//jmi_p44.c
//
//program to read date in the format dd/mm/yyyy & prints date in the format dd month_name yyyy
//

#include<stdio.h>
#include<assert.h>

#define MIN_YEAR 1600
#define MAX_YEAR 9999

void err_msg()
{
  printf("\nInvalid date.....!\n\n");
}

int check_leap_year(int y)
{
	if(y % 4 == 0 || y % 400 == 0) return 1; // leap year
	else if(y % 100 == 0) return 0; // non leap year
	else return 0;  // non leap year
}

int check_date(int d, int m, int y)
{
	if(y < MIN_YEAR || y > MAX_YEAR || m < 1 || m > 12 || d < 1)
	 {
	  err_msg();
	  return 0;//invalid date
     }
	 else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
     { 
      if(d > 31)
      {
	   err_msg();
	   return 0;	//invalid date
      }
	 }	
	 else if(m == 4 || m == 6 || m == 9 || m == 11)
     {
      if(d > 30)
      {
	   err_msg();
	   return 0;	//invalid date
      }
	 }
	 else if( m == 2 )
	 {
		int is_leap_year;
		is_leap_year = check_leap_year(y); //return 1 if leap year else 0
		
		if(is_leap_year)
		{
		 if(d > 29)
		 {
   	      err_msg();
	      return 0;	//invalid date
         }
		}
		else
		{
		 if(d > 28)
		 {
	      err_msg();
	      return 0;	//invalid date
         }
		}
	 }
	return 1; //invalid date
 }

char* get_month_name(int m)
{
   switch(m)
   {
    case 1 : return "JAN";
	case 2 : return "FEB";
	case 3 : return "MAR";
	case 4 : return "APR";
	case 5 : return "MAY";
	case 6 : return "JUN";
	case 7 : return "JUL";
	case 8 : return "AUG";
	case 9 : return "SEP";
	case 10: return "OCT";
	case 11: return "NOV";
	case 12: return "DEC";
   }
}

int main()
{
	int d, m, y;
	
	printf("Enter date(dd/mm/yyyy) : ");
	scanf("%d %*c %d %*c %d", &d, &m, &y);
	
    assert(check_date(d, m, y));
    
	printf("\nDate is %d %s, %d", d, get_month_name(m), y);
    return 0;
}