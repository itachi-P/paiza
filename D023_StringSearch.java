package paiza;

import java.util.Scanner;
//文字列の中に含まれる特定の文字の出現回数(substring()使用版)
public class D023_StringSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//文字列中から文字"A"を決め打ちで検索
		String str = sc.nextLine();
		//文字列を1文字づつに分解しマッチングするメソッド
		System.out.println(stringSearch(str, "A"));
	}

	//substring()とlength()を使って分解し1文字づつマッチング
	//String.toCharArray()を使った方がスマート
	public static int stringSearch(String str, String target){
		int count = 0;
		//substring()に渡す引数(開始・終了位置インデックス)
		int start = 0, end = 1;
		//文字列を1字づつ分解した時の1文字格納用String
		String cut;

		for(int i = 0; i < str.length(); i++) {
//System.out.println(start + ":" + end);
			cut = str.substring(start, end);
			//String型なので==ではダメな点に注意
			if(cut.equals(target)) {
				count++;
			}
			start++;
			end++;
		}
		return count;
	}
}