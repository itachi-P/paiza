package paiza;

import java.util.Scanner;

public class C024_MiniComputer {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int v1 = 0, v2 = 0;
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String[] command = sc.nextLine().split(" ");
			if (command[0].equals("SET")) {
				if (command[1].equals("1")) {
					v1 = Integer.parseInt(command[2]);
				} else if (command[1].equals("2")) {
					v2 = Integer.parseInt(command[2]);
				}
				continue;
			} else if (command[0].equals("ADD")) {
				v2 = v1 + Integer.parseInt(command[1]);
				continue;
			} else if (command[0].equals("SUB")) {
				v2 = v1 - Integer.parseInt(command[1]);
			}
		}
		System.out.println(v1 + " " + v2);
	}
}