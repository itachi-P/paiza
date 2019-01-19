package paiza;

import java.util.Scanner;

public class C033_Umpire {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//投球数
		int N = sc.nextInt();
		//"strike" or "ball"
		String str;
		int st = 0, bl = 0;

		for (int i = 1; i <= N + 1; i++) {
			str = sc.nextLine();
			if (str.equals("strike")) {
				st++;
				if (st == 3) {
					str = "out";
				}
			} else if (str.equals("ball")) {
				bl++;
				if (bl == 4) {
					str = "fourball";
				}
			}
			if (i > 1) {
				System.out.println(str + "!");
			}
		}
	}
}