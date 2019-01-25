package paiza;

import java.util.Scanner;
//ある8月の直前の台風からの日数(入力は5回、値の範囲は1～31)
public class D048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//前日と当日
		int bDay = 0; int aDay = 0;

		for (int i = 0; i < 5; i++) {
			aDay = sc.nextInt();
			//初回入力は計算・表示しない
			if (i == 0) {
				bDay = aDay;
				continue;
			}
			System.out.println(aDay - bDay);
			bDay = aDay;
		}
	}
}