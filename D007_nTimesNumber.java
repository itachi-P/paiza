package paiza;

import java.util.Scanner;

public class D007_nTimesNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}