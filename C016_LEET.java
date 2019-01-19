package paiza;

import java.util.Scanner;

public class C016_LEET {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = new String[str.length()];
		String[] LEET1 = {"A", "E", "G", "I", "O", "S", "Z"};
		String[] LEET2 = {"4", "3", "6", "1", "0", "5", "2"};

		for (int i = 0; i < str.length(); i++) {
			String str2 = String.valueOf(str.charAt(i));

			for (int j = 0; j < 7; j++) {
				if (str2.equals(LEET1[j])) {
					str2 = LEET2[j];
				}
				strArray[i] = str2;
			}
		}
		for (int k = 0; k < strArray.length; k++) {
			System.out.print(strArray[k]);
		}
		System.out.println();
	}
}