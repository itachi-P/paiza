package paiza;

import java.util.Scanner;

public class C019_PerfectNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//入力数
		int Q = sc.nextInt();
		String[] result = new String[Q];

		for (int i = 0; i < Q; i++) {
			int num = sc.nextInt();
			int calc = isPerfectNo(num);
			if(calc == 0) {
				result[i] ="perfect";
			}else if(calc == 1 || calc == -1) {
				result[i] = "nearly";
			} else {
				result[i] = "neither";
			}
		}
		for (int i = 0; i < Q; i++) {
			System.out.println(result[i]);
		}
	}

	public static int isPerfectNo(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return num - sum;
	}
}