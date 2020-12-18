package restart;

import java.util.Scanner;

public class NumberPalindrome {
	private static Scanner scan;
public static void main(String[] args) {
	int num;
	boolean ans;
	scan = new Scanner(System.in);
	System.out.print("Enter any number: \n");
	num = scan.nextInt();
	NumberPalindrome obj = new NumberPalindrome();
	ans = obj.isPalindrome(num);
	System.out.println(ans);
}
public boolean isPalindrome(int num) {
    int tempnum = num, reversenum = 0, temprevnum = 0;
    while(tempnum > 0) {
    	temprevnum = tempnum % 10;
    	reversenum = reversenum * 10 + temprevnum;
    	tempnum = tempnum / 10;
    }
    if(reversenum == num) {
    	return true;
    }
    else {
    	return false;
    }
}
}
