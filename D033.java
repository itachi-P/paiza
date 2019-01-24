package paiza;

import java.util.Scanner;
//入力された氏名からイニシャルを表示
public class D033 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");

        System.out.println(line[0].substring(0, 1)+ "." + line[1].substring(0, 1));
    }
}