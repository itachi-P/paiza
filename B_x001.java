package paiza;

import java.util.Scanner;
//総当たり戦の対戦成績と優勝チームのデータ表示
/* 入力例：チーム数→総当たり戦績表(Win2点, Draw1点, Lose0点)
3
-DW
D-D
LD-
結果：優勝チーム 得点 勝ち数 引き分け数 負け数
1 3 1 1 0
*/
public class B_x001 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //チーム数n
        int n = sc.nextInt();
        //対戦成績表
        String str;
        String[][] records = new String[n][n];

        //捨て入力
        sc.nextLine();

        //対戦成績表を二次元配列recordsに格納
        for (int i = 0; i < n; i++) {
            str = sc.nextLine();
        	for (int j = 0; j < n; j++) {
        		records[i][j] = str.substring(j, j+1);
        	}
        }

        //優勝チームの戦績を表示するメソッド
        totaling(records);

	}

	public static void totaling(String[][] records) {
		int maxScore = 0;int winner = 0;

		for (int i = 0; i < records.length; i++) {
			//各チームのスコア
			int score = 0;

			for (int j = 0; j <records.length; j++) {
				//チーム対戦成績表なのでi=jの時は処理不要
				if (i != j) {
					if (records[i][j].equals("W")) {
						score += 2;
						if (maxScore < score) {
							maxScore = score;
							winner = i;
						}
					} else if (records[i][j].equals("D")) {
						score += 1;
						if (maxScore < score) {
							maxScore = score;
							winner = i;
						}
					} else {
						//"L"及びその他の入力ミス時の処理は想定しない
					}
				}
			}
		}

		String result = winnerRecord(winner, maxScore, records);

		System.out.println(result);
	}

	public static String winnerRecord(int winner, int maxScore, String[][] records) {
		String result = winner + 1 + " " + maxScore;
		int win = 0; int draw = 0; int lose = 0;
		for (int i = 0; i < records.length; i++) {
			if(records[winner][i].equals("W")) {
				win += 1;
			} else if (records[winner][i].equals("D")) {
				draw += 1;
			} else if (records[winner][i].equals("L")) {
				lose += 1;
			} else {
				//"-"の時は何も処理しない
			}
		}
		result += " " + win + " " + draw + " " + lose;
		return result;
	}
}
