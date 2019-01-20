package paiza;

import java.util.Scanner;

public class D038 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n * (n-1) / 2);
	}
}