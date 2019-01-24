package paiza;

import java.util.Scanner;
//入力回数中の電波強度のうち6以上のみカウントし、その回数を表示
public class EngineerDeadWorld_D001 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str;
		int count = 0;

		for(int i = 0; i < n; i++) {
			str = sc.next();
			//電波強度5以下はノーカウント
			if (Integer.parseInt(str) > 5) {
				count++;
			}
		}
		System.out.println(count);
	}
}
