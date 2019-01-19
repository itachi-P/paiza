package paiza;

import java.util.Scanner;

public class D095_JuiceDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        //N mlのジュースを M mlのコップ何杯に分けられるか(余りは無視)
        System.out.println(N / M);
    }
}