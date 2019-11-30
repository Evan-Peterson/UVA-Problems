package index;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/* Sample Input
 * 2 # of test cases
 * 14 # of days for the test case
 * 3 # of political parties
 * 3 hartal parameter 
 * 4 hartal parameter
 * 8 hartal parameter
 * 100 # of days for test case
 * 4 # of political parties
 * 12 hartal
 * 15 hartal
 * 25 hartal	
 * 40 hartal
 */

public class Hartals {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		
		int testCases = in.nextInt();
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		int k = 0;
		while(k < testCases) {
			int days = in.nextInt();
			
			int numPolParties = in.nextInt();
			
			int[] hartalParams = new int[numPolParties];
			
			for (int i = 0; i < hartalParams.length; i++) {
				hartalParams[i] = in.nextInt();
			}
			
			output.add(getDaysLost(days, numPolParties, hartalParams));
			k++;
		}
		
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
		
		in.close();
	}
	
	
	public static int getDaysLost(int days, int numPolParties, int[] hartalParams) {
		int daysLost = 0;
		ArrayList<Integer> dayArr = new ArrayList<Integer>();
		
		for(int i = 0;i < hartalParams.length;i++) {
			

			for(int j = 0;j <= days;j += hartalParams[i]) {
				
				int temp = j + 1;
				
				if(temp % 7 != 0 && j % 7 != 0) {
					if(!dayArr.contains(j)) {
						daysLost++;
						dayArr.add(j);
					}
					
				} 
				
			}
		}
		
		
		return daysLost;
	}
}
