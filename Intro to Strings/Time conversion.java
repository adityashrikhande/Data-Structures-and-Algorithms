
// Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if (s.charAt(8) == 'A'){
			if(Integer.valueOf(s.substring(0, 2)) >= 12){
				String st = "00" + s.substring(2, 8);
				System.out.println(st);
			}else{
				s = s.substring(0, 8);
				System.out.println(s);
			}
				
		}else{
			int start = Integer.valueOf(s.substring(0, 2));
			if (start < 12){
					start += 12;
			}
			String st = start + "";

			st += s.substring(2, 8);
			System.out.println(st);
		}
        sc.close();
	}
}
