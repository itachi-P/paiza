package paiza;

import java.util.Scanner;
//テストの採点
public class C_056 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//学生の数n, 合格点m
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		//n人分のテストの点数と欠席回数
		String[] str = new String[2];
		int[] test = new int[n]; int[] absent = new int[n];

		//捨て入力(改行)
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			str = sc.nextLine().split(" ");
			test[i] = Integer.parseInt(str[0]);
			absent[i] = Integer.parseInt(str[1]);
		}

		for (int i = 0; i < n; i++) {
			if (m == 0) {
				//合格点=0なら無条件に全員合格
				System.out.println(i + 1);
			} else 	if (test[i] - 5 * absent[i] >= m) {
				//合格者の学籍番号のみ表示
				System.out.println(i + 1);
			}
		}
	}
}