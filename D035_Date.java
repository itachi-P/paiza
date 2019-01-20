package paiza;

import java.util.Scanner;
//日付のデータ
public class D035_Date {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		//"2019 2 12"と入力される

/*		next()で順に読み込みy,m,dに格納する方法
		String y = sc.next();
		String m = sc.next();
		String d = sc.next();
		System.out.println(y + "/" + m + "/" + d);
		処理速度0.26秒
*/
/*		nextLine()で一気に読み込みsplit(" ")で配列に格納しint型に変換
		String[] date = sc.nextLine().split(" ");
		int y = Integer.parseInt(date[0]);
		int m = Integer.parseInt(date[1]);
		int d = Integer.parseInt(date[2]);
		System.out.println(y + "/" + m + "/" + d);
		処理速度0.26秒
*/

/*		そもそもint型にキャストする必要が無いので最も記述の少ない方法
		String[] date = sc.nextLine().split(" ");
		System.out.println(date[0] + "/" + date[1] + "/" + date[2]);
		処理速度0.26秒…これが最速最軽量かと思えばいずれも殆ど差なし
*/
		//あまり必要性無いがforループで配列要素取り出す方法
		String[] date = sc.nextLine().split(" ");
		for (int i = 0; i < date.length; i++) {
			System.out.print(date[i]);
			if (i < date.length - 1) {
				System.out.print("/");
			}
		}
		//処理速度0.18秒…ん？！
		//何故かforループで回して取り出すこの方法が一番高速処理らしい
	}
}