package paiza;

import java.util.Scanner;
//じゃんけんの勝数表示
/* 最初に勝負回数n、以降にn回のじゃんけんの手の形が与えられる
3
g g
c p
p g
求められる結果：それぞれの勝ち数を表示
2
0
 */
public class EngineerDeadWorld_C002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//じゃんけんの回数n
		int n = sc.nextInt();
		//2人の出した手の形
		String[] game = new String [2];
		//2人の勝数
		int[] wins = {0, 0};
		//捨て入力
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			game = sc.nextLine().split(" ");
			//引き分けの場合何も処理しない
			if (!game[0].equals(game[1])) {
				if ((game[0].equals("g") && game[1].equals("c"))
						|| (game[0].equals("c") && game[1].equals("p"))
						|| (game[0].equals("p") && game[1].equals("g"))) {
					wins[0]++;
				} else if ((game[0].equals("g") && game[1].equals("p"))
						|| (game[0].equals("c") && game[1].equals("g"))
								|| (game[0].equals("p") && game[1].equals("c"))) {
					wins[1]++;
				}
			}
		}
		System.out.println(wins[0]);
		System.out.println(wins[1]);
	}
}