
// Adrian, Bruno and Goran wanted to join the bird lovers’ club. However, they did not know that all applicants must pass an entrance exam. The exam consists of n questions, each with three possible answers: A, B and C.

// Unfortunately, they couldn’t tell a bird from a whale so they are trying to guess the correct answers. Each of the three boys has a theory of what set of answers will work best:

// Adrian claims that the best sequence is: A, B, C, A, B, C, A, B, C, A, B, C ...

// Bruno is convinced that this is better: B, A, B, C, B, A, B, C, B, A, B, C ...

// Goran laughs at them and will use this sequence: C, C, A, A, B, B, C, C, A, A, B, B ...

// Write a program that, given the correct answers to the exam, determines who of the three was right – whose sequence contains the most correct answers.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String pat1 = "ABC";
		String pat2 = "BABC";
		String pat3 = "CCAABB";
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for(int i=0; i<n; i++){
				
			if(s.charAt(i) == pat1.charAt(i%3)){
					c1++;
			}
			if(s.charAt(i) == pat2.charAt(i%4)){
					c2++;
			}
			if(s.charAt(i) == pat3.charAt(i%6)){
					c3++;
			}
		}
		int m = Math.max(c1, Math.max(c2, c3));
		System.out.println(m);
		 
		if(m == c1){
			System.out.println("Adrian");
		}
		if(m == c2){
			System.out.println("Bruno");
		}
		if(m == c3){
			System.out.println("Goran");
		}  
		sc.close();
	}
}
