package paiza;

import java.util.Scanner;
//指定した桁数での0埋め
/* 桁数n,表示したい番号の区間a,bが1行で与えられる
入力例：
3 9 11
期待される結果：
009
010
011
 */
public class EngineerDeadWorld_C003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//標準入力の分解
		String str[] = sc.nextLine().split(" ");
		String n = str[0]; String a = str[1]; String b = str[2];

		//0埋めの桁数を指定
		String padPattern = "%0" + str[0] + "d";
System.out.println(padPattern);
		for (int i = Integer.parseInt(a); i <= Integer.parseInt(b); i++) {
			System.out.println(String.format(padPattern, i));
		}
	}
}
