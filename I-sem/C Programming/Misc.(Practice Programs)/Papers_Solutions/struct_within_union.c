#include<stdio.h>
#include<conio.h>

struct student {
        char name[20];
        int rollno;
    };
    
union details {
		
        struct student st;
	};


int main() {
     
    union details set;
    
    
      
    
    printf("\n\nEnter student details:");
    
    printf("\nEnter name : ");
    scanf("%s", set.st.name);
    
	printf("\nEnter roll no : ");
    scanf("%d", &set.st.rollno);
    
    printf("\nThe student details are : \n");
    
	printf("\Name : %s", set.st.name);
	printf("\nRollno : %d", set.st.rollno);
    
    
   return 0; 
}
