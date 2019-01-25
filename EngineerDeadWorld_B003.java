package paiza;

import java.util.Scanner;

/*下記のプログラムでeclipse上では問題なく動作するが、
 * paizaの標準入力の仕様ではどうやらmainメソッド内から別のメソッドを
 * 呼び出した時点で暗黙の了解としてSystem.inが閉じられてしまい、
 * 一度閉じられるとnew Scannerで別のインスタンス生成しても入力不可
 * この実行環境によるエラー回避の為にメソッド引数にscを渡すしかない？
 */

/*座標(0,0)を始点とした移動後の座標の不正(枠外移動)チェック
 * 縦にH段、横にW列、n回の移動方向を受け取る
3 3 5
U
R
D
R
L
valid
 */
public class EngineerDeadWorld_B003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");

		//座標(0,0)を始点とした縦h×横wの枠内をn回移動
		int h = Integer.parseInt(input[0]);
		int w = Integer.parseInt(input[1]);
		//入力(座標移動)回数n
		int n = Integer.parseInt(input[2]);

//System.out.println(isInRange(h, w, n));
/* ※paizaの仕様による落とし穴あり
 * eclipse上では問題なく動作するが、paizaの仕様ではどうやら
 * 標準入力(System.in)が自動的に閉じられ、以降new Scannerしても
 * 入力が受け付けられず入力を読み込んだ(next系)した時点でエラー発生
 * 回避の為にやむなくメソッドの引数にScannerのインスタンスを渡す
 */
		System.out.println(isInRange(sc, h, w, n));

	}

	//public static String isInRange(int h, int w, int n) {
/* paizaの実行環境の仕様ではmainメソッドの外で再度標準入力の
 * インスタンス生成しても入力不可エラーなのでscを引数に渡すよう修正。*/
	public static String isInRange(Scanner sc, int h, int w, int n) {
//paizaの仕様ではこのやり方は不可らしい…
//Scanner sc2 = new Scanner(System.in);

//座標(0, 0)を起点とした移動可能領域 //※不要
//int[][] space = new int[h][w]; //単純な計算&大小比較で可能

		//現在座標
		int x = 0; int y = 0;
		//方向を表す1文字 U D L R
		String way;

		for (int i = 0; i < n; i++) {
			way = sc.nextLine();
//本来不要だが、末尾に改行コードが含まれた場合のマッチング不整合対策
//System.out.println("#" + way + "#");
			way = way.substring(0, 1);
//System.out.println("$" + way + "$");

			switch (way) {
			case "U":
				y++;
				if (y > h - 1) {
					return "invalid";
				}
				break;
			case "D":
				y--;
				if (y < 0) {
					return "invalid";
				}
				break;
			case "L":
				x--;
				if (x < 0) {
					return "invalid";
				}
				break;
			case "R":
				x++;
				if (x > w - 1) {
					return "invalid";
				}
			}
		}
		return "valid";
	}
}