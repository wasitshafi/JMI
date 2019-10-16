//
//jmi_p1.cpp
//
//A program to add 2 complex numbers using friend function

#include<bits/stdc++.h>

using namespace std;

class COMPLEX{
	int real;
	int img;
	public:
  COMPLEX(){}

	COMPLEX(int x)
	{
		real = img = x;
	}

	COMPLEX(int r,int i)
	{
		real = r;
		img = i;
	}
	friend void putdata( COMPLEX );
	friend COMPLEX sum( COMPLEX, COMPLEX );
};


	void putdata( COMPLEX c )
	{
		if( c.img == 0 )
		 cout << c.real;
		else if( c.real == 0)
		 cout << c.img << "i";
		else if( c.img < 0)
		 cout << c.real << c.img << "i";
		else
		 cout << c.real << " + " << c.img << "i";
	          // OR   // refer: 
	/*  if(real == 0 && img == 0)
            System.out.print("0");
        else if(img == 0)
            System.out.print(real);
        else
        {
            System.out.print(real);
            if(img < 0)
                System.out.print(img + "i");
            else
                System.out.print( "+" + img + "i");
        }
	 */
	}
	COMPLEX sum(COMPLEX c1, COMPLEX c2)
	{
    COMPLEX c;
		 c.real = c1.real + c2.real;
		 c.img = c1.img + c2.img;
     return c;
	}

int main()
{
	COMPLEX c1, c2, c3;
	int r, i, x;

	cout << endl << "Enter real/img part of complex no 1 :";
  cin >> x;

	c1 = COMPLEX(x);

	cout << endl << "Enter real part of complex no 2 : ";
	cin >> r;
	cout << endl << "Enter imaginary part of complex no 2 :";
	cin >> i;
	c2 = COMPLEX(r, i);

	c3 = sum(c1,c2);

  cout << endl << "\nC1 = ";
	putdata(c1);
  cout << "\nC2 = ";
	putdata(c2);
	cout << endl << "\nC1 + C2 = ";
	putdata(c3);

	return 0;
}
