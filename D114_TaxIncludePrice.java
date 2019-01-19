package paiza;

import java.util.Scanner;
//2つの数字a(税率)とb(本体価格)をスペース区切りで入力する前提で計算
public class D114_TaxIncludePrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        //入力された文字列をスペース区切りで配列に格納
        String array[] = line.split(" ");

        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        //税込み価格を表示
        System.out.println(b + b * a / 100);
    }
}