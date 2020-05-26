
># <div align="center">**OOP in C++**</div>
>> ### Taught by : _[Dr.Syed Zeeshan Hussain](https://www.jmi.ac.in/computerscience/faculty-members/Dr_Syed_Zeeshan_Hussain-2203 "See Profile")_

<div align="center">MCA SEMESTER-II</div>
<br/>

<div align="center">LAB ASSIGNMENT FOR OOP in C++</div>

***

**[View All Assignments](https://github.com/wasitshafi/JMI-MCA/tree/master/II-sem/C%2B%2B/Assignments)**

> ### Class, object, Function

_[Q1. Write an inline function to obtain largest of three numbers.](Assignments/Assig.%20I/jmi_p1.cpp "View Code")_

_[Q2. Write a function called hms_to_secs() that takes three int values—for hours, minutes, and seconds—as arguments, and returns the equivalent time in seconds (type long). Create a program that exercises this function by repeatedly obtaining a time value in hours, minutes, and seconds from the user (format 12:59:59), calling the function, and displaying the value of seconds it returns](Assignments/Assig.%20I/jmi_p2.cpp "View Code")_
_<a href= "Assignments/Assig.%20I/jmi_p3.cpp" title = "View Code"><div>Q3. Define a class to represent a bank account. It contains
  + Data Members:
    - Name of the depositor 
    - Account Number 
    - Type of account 
    - Balance 
  + Member Functions: 
    - To assign initial values 
    - To deposit an amount 
    - To withdraw an amount < amount available 
    - Display the name and balance.
    </div></a>_
_<a href= "Assignments/Assig.%20I/jmi_p4.cpp" title = "View Code"><div>Q.4  Create a bank account by supplying a user id and password. 
Login using their id and password. 
Quit the program. 
Now if login was successful the user will be able to do the following: 
- Withdraw money. 
- Deposit money. 
- Request balance.

Quit the program.
If login was not successful (for example the id or password did not match) then the user will be taken back to the introduction menu. </div></a>_
_<a href= "Assignments/Assig.%20I/jmi_p5.cpp" title = "View Code"><div>Q.5 Create a class to add Two times provided in hour minute format. Use functions
a) void input() to provide hour and minute.  
b) void gettime(int ,int) to take hour and minute entered by user. 
c) sum(time <oj>, time <ob> )  to add minutes and hours. If minutes is > 60 add 1 with hour.
d) void display()   to display the result. </div></a>_
_<a href= "Assignments/Assig.%20I/jmi_p6.cpp" title = "View Code"><div>Q.6 To write a C++ program to add two complex numbers using object as argument.
**Algorithm:**
**class** as complex. 
**data members** as real and img. 
**member functions** 
   - void getdata()  
   - void show()  
   - void sum(complex c1,complex c2)  
   - getdata() method is used to get the values . 
   - show() method is used to display the values. 
   - sum() method is used to perform addition operation using object as argument. </div></a>_
_<a href= "Assignments/Assig.%20I/jmi_p7.cpp" title = "View Code"><div>Q.7 To write a C++ program to display the student details using class and array of object. 
**Algorithm:**
**class** as student. 
**data members rollno, name, mark1, mark2, mark3, total and average.  
**member functions ** as getdata() and displaydata(). 
            - getdata() method used to get the  student details. 
            - displaydata() method used to display the student details. 
create an object array for the student class using the following  syntax:
<br/><br/>
           Get the number of students. 
           Enter student details 
           display the student details  </div></a>_
_<a href= "Assignments/Assig.%20I/jmi_p8.cpp" title = "View Code"><div>Q.8 Re-write the time addition program using friend function.</div></a>_
_<a href= "Assignments/Assig.%20I/jmi_p9.cpp" title = "View Code"><div>Q.9  write C++ program to define matrix and vector class, to use function with default argument and to do matrix -vector  multiplication using friend function.
- Declare vector Class 
- Define matrix Class
- Declare friend function multiply() inside the matrix class  
- Define vector Class  
- Declare friend function multiply(matrix &, vector &) inside the vector class  
- Define getvector() function with for loop to get the elements for vector  
- Define disvector() function with for loop to display the contents of vector  
- Define getmatrix() function with nested for loops to get the matrix elements  
- Define dismatrix() function with nested for loops to display the matrix  
- Define the multiply() to multiply matrix and vector<br/>
    • a. No of columns in the matrix should be equal to no. of elements in the vector<br/>
    • b. Apply the matrix-vector multiplication mechanism:<br/>
    • For simplicity take the matrix as 3X3 and the vector as 1X3. </div></a>_
<hr/>


#### **Drop me a line at** <wasitshafi185290@st.jmi.ac.in>
<!-- Template 
Q#.   _[](Assignments/Assig.%20I "View Code")_
-->





















<br/><br/><br/>
---
> # How to run program from linux terminal
>  - **Method 1**
>    - use cmd ``g++ filename.cpp`` hit enter now to run executable file use ``./a.out`` hit enter.
>  - **Method 2**
>    - use cmd ``g++ filename.cpp -o executablefilename`` hit enter now to run executable file use ``executablefilename`` hit enter.
>       - E.g. ``g++ hello.cpp -o a`` hit enter now to run executable file use ``a`` hit enter.
<br/><br/>
>  - **Method 3**
>    - use cmd ``g++ -std=c++11 -o2 -Wall filename.cpp -o executablefilename`` hit enter now to run executable file use ``executablefilename`` hit enter.
>       - E.g. ``g++ -std=c++11 -o2 -Wall hello.cpp -o a`` hit enter now to run executable file use ``a`` hit enter.
<br/><br/>
> # How to run program from windows dos
>  - **Method 1**
>    - use cmd ``g++ filename.cpp`` hit enter now to run executable file use ``a.exe`` hit enter.
>  - **Method 2**
>    - use cmd ``g++ -std=c++11 -o2 -Wall filename.cpp -o executablefilename`` hit enter now to run executable file use ``executablefilename`` hit enter.
>       - E.g. ``g++ -std=c++11 -o2 -Wall hello.cpp -o a`` hit enter now to run executable file use ``a`` hit enter.
<br/><br/>
> # How to run program from which include user defined header files([Refer](https://github.com/wasitshafi/JMI-MCA/blob/master/II-sem/c%2B%2B/Assignments/Assig.%20IV/jmi_p2.cpp))
>  - **Method 1**
>    - use cmd ``g++ mainprogramfile.cpp userdefinedfunctionfile.cpp`` hit enter now to run executable file use ``./a.out`` hit enter.
>       - E.g. ``g++ jmi_p2.cpp  myfunctions.cpp`` hit enter now to run executable file use ``./a.out`` hit enter.
<br/><br/>
