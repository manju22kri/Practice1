package Java_interview;

import java.io.IOException;

public class Check_Vowel {
	public static void main(String[] args) throws IOException {

		String name = "Manjunath";
		String str = name.toLowerCase();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (str.charAt(i) == 'a'||  str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{		
				count++;
			}
		}
		System.out.println(count);
	}
}



