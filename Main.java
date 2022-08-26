/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner a= new Scanner(System.in);
		int r= a.nextInt();
		int c= a.nextInt();
		int arr[][]= new int [r][c];
		for(int i=0; i<r; i++){
		    for(int j=0; j<c; j++){
		        arr[i][j]= a.nextInt();
		    }
		}
		    int sr=0;
		    int sc=0;
		    int ec= c-1;
		    int er= r-1;
		    int count=0;
		    while(count< r*c){
		        for(int col=sc; col<=ec && count< r*c; col++){
		        System.out.print(arr[sr][col] + " ");
		        count++;
		        }
		        sr++;
		        for(int row= sr; row<= er && count< r*c; row++){
		            System.out.print(arr[row][ec] + " ");
		            count++;
		        }
		        ec--;
		        for(int col= ec; col>= sc && count< r*c; col--){
		            System.out.print(arr[er][col] + " ");
		            count++;
		        }
		        er--;
		        for(int row= er; row>= sr && count< r*c; row--){
		            System.out.print(arr[row][sc] + " ");
		            count++;
		        }
		        sc++;
		    }
		}
	}


