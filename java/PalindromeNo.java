package new;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n, rev = 0;
		
		while(temp>0) {
			int lastDigit = temp%10;
			temp = temp/10;
			rev = rev*10 + lastDigit;
		}
		
		if(n == rev) {
			System.out.println(n + " is a palindrome number");
		}
		else {
			System.out.println(n + " is not a palindrome number");
		}
	}
  
}
