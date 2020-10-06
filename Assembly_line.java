import java.util.*;
import java.io.*;
/* happy coding */
public class Assembly_line {

//method for calculating minimum path
public static int factory(int station[][],int tra[][],int entry[],int exit[]) {
//calculating cost initially
int fir_line=entry[0]+station[0][0];
int se_line=entry[1]+station[0][1];
//calculating cost for every station parrallaly
for(int i=0;i<station[0].length;i++) {
int up = Math.min(fir_line + station[0][i], se_line+ tra[1][i] + station[0][i]),
down = Math.min(se_line + station[1][i], fir_line+ tra[0][i] + station[1][i]);
fir_line= up;
 se_line = down;
}
//returning the final value
return Math.min( fir_line += exit[0],se_line += exit[1]);
}

public static void main(String args[]) {
//declaring the array
int station[][]=
{{5,6,7,8,9,10,11,12,13,15,14,10,6,7,8},
{11,12,5,6,8,13,7,8,9,15,14,12,10,11,13}};
int t[][]=
{{10,12,5,6,13,7,14,5,9,10,8,11,9,8,6},
{8,5,15,7,9,6,10,12,15,14,8,15,12,8,13}};
int entry[]= {9,11};
int exit[]= {14,11};
//printing the final minimum cost 
System.out.println("Minimum cost to pass through the factory is "+ factory(station,t,entry,exit));
}
}
