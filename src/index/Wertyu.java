package index;

import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Scanner;

//O S, GOMR YPFSU/

public class Wertyu {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		
		String phrase = in.nextLine();
		char[] phraseArr = phrase.toCharArray();
		
		for (int i = 0; i < phraseArr.length; i++) {
			phraseArr[i] = getCorrectChar(phraseArr[i]);
		}
		
		String result = new String(phraseArr);
		System.out.println(result);
		
	}
	
	
	public static char getCorrectChar(char c) {
		char a[]={'1', '2', '3', '4', '5', '6', '7', '8', '9', '0',  '-', '=', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '[', ']', '\\', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';', '\'', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', ',', '.', '/'};
		
		
		for(int i = 0; i < a.length;i++) {
			if(a[i] == c) {
				return a[i - 1];
			}
		}
		
		return c;
	}

}
