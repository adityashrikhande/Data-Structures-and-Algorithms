// Gian and Suneo want their heights to be equal so they asked Doraemon for help. Doraemon gave a big light to both of them but both big lights have different speeds of magnifying. Let us assume the big light given to Gian can increase the height of a person by v1 m/s and that of Suneos big light is v2 m/s. At the end of each second Doraemon check if their heights are equal or not.

// Given the initial height of Gian and Suneo, your task is to check whether the height of Gian and Suneo will become equal at some point or not, assuming they both started at the same time.

import java.util.*;
//import java.lang.*;
//import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		
		if ((v1 != v2) && (a-b)%(v1-v2) == 0){
				System.out.println(true);
		}else{
				System.out.println(false);
		}
        sc.close();               
	}
}
