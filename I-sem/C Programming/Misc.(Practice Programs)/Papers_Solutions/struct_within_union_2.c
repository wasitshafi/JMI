#include<stdio.h>
#include<conio.h>

union details {
	
    struct student {
        char name[20];
        int rollno;
    }st;
    };

int main() {
     
    union details set;    
    
    printf("Enter student details:");
    
	printf("\nEnter name : ");
    scanf("%s", set.st.name);
    
	printf("\nEnter roll no : ");
    scanf("%d", &set.st.rollno);
    
    printf("\nThe student details are : \n");
   
    printf("\name : %s", set.st.name);
    printf("\nRollno : %d", set.st.rollno);

   return 0; 
}
