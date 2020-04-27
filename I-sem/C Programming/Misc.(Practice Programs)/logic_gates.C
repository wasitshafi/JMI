//
//logic_gates.c
//
//A program to simulate logic gates

#include<stdio.h>
#include<graphics.h>
#include<conio.h>

void draw_logic_gates(int, int, int);
int getand(int , int , int );
int getor(int , int , int );
int getnand(int, int);

int main()
{
 int x, y, z;

 clrscr();

 do
 {
  printf("\n\nEnter value of 'x' ( 0 / 1 ) :\t");
  scanf("%d", &x );

  if( x != 0 && x != 1) printf("Invalid input....! Try again.");

 }while( x != 0 && x != 1 );

 do
 {
  printf("\n\nEnter value of 'y' ( 0 / 1 ) :\t");
  scanf("%d", &y );

  if( y != 0 && y != 1 ) printf("Invalid input....! Try again.");

 }while( y != 0 && y != 1 );

 do
 {
  printf("\n\nEnter value of 'z' ( 0 / 1 ) :\t");
  scanf("%d", &z );

  if( z != 0 && z != 1 ) printf("Invalid input....! Try again.");

 }while( z != 0 && z != 1 );


 draw_logic_gates( x, y, z );

 getch();
 return 0;
}

void draw_logic_gates( int x, int y, int z )
{
 int gd = DETECT, gm;

  char outx[1];         /* will be used as buffers */
  char outy[1];
  char outz[1];
  char out_and[1];
  char out_or[1];
  char out_nand[1];

  int output_of_and = getand( x, y, z );
  int output_of_or = getor( x, y, z );
  int output_of_nand = getnand( output_of_and, output_of_or );

  initgraph(&gd, &gm, "C://TC//BGI");

 outtextxy( 1, 25, "X" );   // labels
 outtextxy( 18,25, "Y" );
 outtextxy( 38,25, "Z" );

 line( 1, 40, 1, 160 );     // main input lines
 line( 20, 40, 20, 170 );
 line( 40, 40, 40, 180 );


/* ############## Start of AND gate ############ */

 setcolor( RED );
			   // how to print integer variable at runtime
 sprintf( outx, "%d", x );  //plz refer https://in.answers.yahoo.com/question/index?qid=20110126060415AAaydU5
 outtextxy( 50, 62, outx );

 sprintf( outy, "%d", y );
 outtextxy( 65, 72, outy );

 sprintf( outz, "%d", z );
 outtextxy( 80, 82, outz );

 line( 1, 70, 100, 70 );  // input line 1 for AND gate
 line( 20, 80, 100, 80 );  // input line 2 for AND gate
 line( 40, 90, 100, 90 );  // input line 3 for AND gate


 line( 100, 60, 100, 100 ); // verticle line of AND gate
 ellipse( 100, 80, 270, 90, 20, 20 ); // ellipse for AND gate


/*############## End of AND gate ############# */


/* ############## Start of OR gate ############ */

 setcolor( GREEN );
 outtextxy( 55, 152, outx );
 outtextxy( 65, 162, outy );
 outtextxy( 80, 172, outz );

 line( 1, 160, 100, 160 ); // input line 1 for OR gate
 line( 20, 170, 100, 170 );  // input line 2 for OR gate
 line( 40, 180, 100, 180 );  // input line 3 for OR gate

 ellipse( 92, 170, 270, 90, 10, 20 );  // verticle arc for OR gate
 ellipse( 100, 170, 265, 95, 40, 20 ); // ellipse for OR gate

/*############## End of OR gate ############# */


/* ############## Output lines ###############*/

 setcolor( RED );
 outtextxy( 155, 72, "X.Y.Z =" );

 sprintf( out_and, "%d", output_of_and );
 outtextxy( 215, 72, out_and );

 line( 120, 80, 230, 80 );  // output line of AND gate

 line( 230, 80, 230, 120 ); // verticle output line of AND gate

 setcolor( GREEN );
 outtextxy( 155, 162, "X+Y+Z =" );
 sprintf( out_or, "%d", output_of_or );
 outtextxy( 215, 162, out_or );

 line( 140, 170, 230, 170 );  // output line of OR gate

 line( 230, 170, 230, 130 );// verticle output line of OR gate

 setcolor( RED );
 line( 230, 120, 300, 120 );// horizontal output line of AND gate

 setcolor( GREEN );
 line( 230, 130, 300, 130 );// horizontal output line of OR gate


 /* ############# Start of NAND gate ############*/
 setcolor( CYAN );
 line( 300, 105, 300, 145 );  // verticle line for NAND gate
 ellipse( 300, 125, 270, 90, 20, 20 );// ellipse for NAND gate


 circle( 322, 125, 2 );// bubble for NAND gate
 line( 324, 125, 500, 125 );// final output line

 outtextxy( 340, 116, "(X.Y.Z)(X+Y+Z) =" ); // equation of NAND gate
 line( 340, 114, 450, 114 ); // bar of above equation

 sprintf( out_nand, "%d", output_of_nand );
 outtextxy( 470, 116, out_nand );

/* ############### End of NAND gate ############# */
}

int getand( int x, int y ,int z )
{
 if( ( x + y + z ) != 3 )
  return 0;
  else
  return 1;
}

int getor( int x, int y, int z )
{
 if( ( x + y + z ) == 0 )
  return 0;
  else
  return 1;
}

int getnand( int x, int y )
{
 if( ( x + y ) == 2 )
   return 0;
   else
   return 1;
}
