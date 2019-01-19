package paiza;

import java.util.Scanner;

public class B027_TrumpGame {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //トランプの縦・横の段数とプレイヤーの数を入力
 		String[] HWN = sc.nextLine().split(" ");
        int H = Integer.parseInt(HWN[0]);
		int W = Integer.parseInt(HWN[1]);
		int N = Integer.parseInt(HWN[2]);

		//トランプの配置
		int[][] t = new int[H][W];
		String[] table;
		for (int i = 0; i < H; i++) {
			table = sc.nextLine().split(" ");
			for (int j = 0; j < W; j++) {
				t[i][j] = Integer.parseInt(table[j]);
			}
		}

		//記録回数,捲られた2枚のカード座標
		int L = sc.nextInt();
		int[][] turns = new int[L][4];
		String[] str = new String[4];

//※nextLine()の仕様上、他のnextXXX()の後で使う場合一度読み捨てる必要あり
//※nextLine以外は入力後カーソルが行末で止まるが、nextLineはそれを行末から改行を除き次の行頭まで読み込むので空文字になる
sc.nextLine();
		for (int k = 0; k < L; k++) {
			str = sc.nextLine().split(" ");
			for (int m = 0; m < 4; m++) {
				turns[k][m] = Integer.parseInt(str[m]);
			}
		}
/*		int[] pScore = new int[N];
		for (int n = 1; n <= N; n++) {
			pScore[n] = score(n, N, t, turns);
		}
*/
		int[] scores = scores(N, t, turns);
		for (int n = 0; n < N; n++) {
			System.out.println(scores[n]);
		}
	}

	private static int[] scores(int num, int[][] table, int[][] turns) {
		int[] scores = new int[num];
		int first = 0; int second = 0;
		//プレイヤー1～Nの各自の点数合計
System.out.println(turns.length);
//first,secondの算出がダブって処理されてる？
		for (int n = 0; n < num; n++) {
			//プレイヤーnが2枚づつ捲ったカードと配置されたカードの照合
			for (int i = 0; i < turns.length; i++) {
//				for (int j = 0; j < turns[i].length; j++) {
				first = table[turns[i][0] - 1][turns[i][1] - 1];
				second = table[turns[i][2] - 1][turns[i][3] - 1];
System.out.println(first + ":" + second);

			}
			if (first == second) {
				scores[n] += 2;
				if (isCard0(scores)) {
					System.out.println("isCard0:"+isCard0(scores));
					break;
				}
				n -= 1;
			} else if (n == num -1) {
				n = 0;
			}
		}
		return scores;
	}

	private static boolean isCard0(int[] scores) {
		int tScore = 0;
		for (int i = 0; i < scores.length; i++) {
			tScore += scores[i];
		}
//(仮)本来の条件は全プレイヤーが取り除いた枚数の総和==場のカード総数
		if (tScore == 4) {
			return true;
		} else {
			return false;
		}
	}

}
