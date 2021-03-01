package quan;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the string: ");
		String str = in.nextLine();
		
		System.out.print("Number of Vowels in the string: " +  String.valueOf(countVowels(str)));
		
	}

	
	public static int countVowels(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'u' || str.charAt(i) == 'o' 
					|| str.charAt(i) == 'e' || str.charAt(i) == 'i' )
			{
				count ++;
			}
			
		}
		return count;
	}
}
