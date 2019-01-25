package paiza;

import java.util.Scanner;
//各文字列の末尾n文字と次の文字列の先頭n文字のマッチング
/* 文字列入力回数n,結合したい各文字列がn行で与えられる
入力例：
4
piza
apple
letter
terminal
期待される結果：
paizappletterminal
 */
public class EngineerDeadWorld_B002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//入力回数
		int n = sc.nextInt();
		//捨て入力
		sc.nextLine();

		//入力文字列群
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}

		//文字列結合
		concatenation(str);

	}

	public static void concatenation (String[] str) {
		//結合後文字列
		String concStr = "";

		for (int i = 0; i < str.length; i++) {
			if (i != 0) {
//先頭からp文字が結合文字列の末尾p文字と一致する場合に削る文字数p
				int p = str[i].length();
//結合文字数が後の文字数より少ない場合の回避策
				if (concStr.length() < str[i].length()) {
					p = concStr.length();
				}

//System.out.println(concStr.substring(concStr.length() - p));
//System.out.println(str[i].substring(0, p));
				while(!(concStr.substring(concStr.length() - p).equals(str[i].substring(0, p)))) {
					p--;
				}
//System.out.println("p = :" + p);

				str[i] = str[i].substring(p);
//System.out.println("#" + str[i] + "#");

			}
			concStr += str[i];
//System.out.println("結合文字列;" + concStr);
		}
		System.out.println(concStr);
	}
}
