package paiza;

import java.util.Scanner;
//AボタンとBボタン
public class D060 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

/*		空白区切りの複数入力値を配列を使って取得する場合
		String[] inputs = sc.nextLine().split(" ");
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
*/
		
//空白区切りで入力される数が決まってるなら配列使うより下の方が楽？
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		System.out.println(a - b);
	}
}