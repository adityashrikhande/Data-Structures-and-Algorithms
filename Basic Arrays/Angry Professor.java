
// Discrete Mathematics professor has a class of n students.

// Frustrated with their lack of discipline, the professor decides to cancel class if fewer than k students are present when class starts. Arrival times go from on time (arrivalTime =<0) to arrived late (arrivalTime>0).

// Given the arrival time of each student and a threshold number of attendees (k), determine if the class is canceled or not.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			int n = sc.nextInt();
			int k = sc.nextInt();
			// int in = 0;
			int cnt = 0;
			for(int x=0; x<n; x++){
			    int in = sc.nextInt();
				if (in <= 0)cnt++;
			}
			if (cnt >= k){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
			cnt = 0;
		}
        sc.close();
	}
}
