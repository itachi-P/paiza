package paiza;

import java.util.Scanner;
//文字列の中に含まれる特定の文字の出現回数(toCharArray()使用版)
public class D023A_StringToCharArraySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//検索対象文字も受け取りchar型で検索
		String[] str = sc.nextLine().split(" ");
		//String型文字列をchar型に変換(=配列に格納)
		char[] ch = str[1].toCharArray();
		//今回は指定文字のStringが1文字の前提なのでch[0]固定
		System.out.println(charSearch(str[0], ch[0]));
	}

	public static int charSearch(String str, char target){
		int count = 0;

		//拡張for文(多言語におけるforeach相当構文)
		for(char x: str.toCharArray()){
			//char型なのでString.equals()じゃなく==でよい
			if(x == target){
				count++;
			}
		}
		return count;
	}
}