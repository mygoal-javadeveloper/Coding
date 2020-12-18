package restart;

import java.util.Arrays;
import java.util.Scanner;

public class SumTwoNumbers {
	private static Scanner scan;
	public static void main(String[] args) {
		System.out.println("Input the series of number elements for the array: \n");
		scan = new Scanner(System.in);
		int[] nums;
		int[] answer = new int[2];
		int target;
		String tempstr;
		tempstr = scan.nextLine();
		String[] strnum = tempstr.split(",");
		nums = new int[strnum.length];
		System.out.println("Input the target: \n");
		target = scan.nextInt();
		for(int i=0; i<strnum.length; i++) {
			nums[i] = Integer.parseInt(strnum[i]);
		}
		SumTwoNumbers obj = new SumTwoNumbers();
		answer = obj.twoSum(nums, target);	
		System.out.println(Arrays.toString(answer));
	}
	
public int[] twoSum(int[] nums, int target) {
	        int result[] = new int[2];
	        int sum = 0;
	        for(int i = 0; i < nums.length-1; i++){
	            int tempnum = nums[i];
	            for(int j = i+1; j<nums.length; j++){
	                sum = 0;
	                sum = tempnum + nums[j];
	                if(sum == target){
	                    result[0] = i;
	                    result[1] = j;
	                    break;
	                }else{
	                    sum = 0;
	                    continue;
	                }
	            }
	        }
	    return result;
	    }
	}


