
// Write a program to print out all Armstrong numbers between 1 and N.

// A number is called an Armstrong number if the sum of cubes of each digit of the number is equal to the number itself.

// For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		int num = 0;
				
		for(int i=1; i<=500; i++){
			int temp = i;
			while(temp > 0){
				int rem = temp%10;
				num += rem*rem*rem;
				temp /= 10;
			}
			if (num == i){
				System.out.println(i);
			}
			num = 0;
		}
	}
}
