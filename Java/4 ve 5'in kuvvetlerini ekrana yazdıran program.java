/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		/* 3'ün kuvveti için 3, 4 için 4 yazabiliriz.*/
		int n;
		Scanner inp=new Scanner(System.in);
		 System.out.println("Sınır sayıyı giriniz: ");
		n=inp.nextInt();
	    
		for (int i=1; i<=n; i*=4){
		    System.out.println("dorduncu üs: " +i);
		}
		
		    for (int i = 1; i <=n; i *= 5) {
                System.out.println(" besinci üs: " + i);
	        }
        }
    }