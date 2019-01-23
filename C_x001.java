package paiza;

import java.util.regex.Pattern;
/* 与えられた文字列が以下の条件を全て満たすか判定する
 * ・長さが 6 以上
 * ・英字と数字の両方を含む必要がある
 * ・同じ文字を 3 つ以上連続で使用することはできない
 * ※上記全てを正規表現一行で実現可能だが、初心者には理解が難しいので分解する
 */
public class C_x001 {

	public static void main(String[] args) {
		//判定文字列
		String str = "7Caaad9";

		System.out.println(judge(str));
	}
	
	public static String judge(String str) {
		//与えられた文字列が全ての条件をクリアしていればValidを返す
		String result = "Invalid";
		//3段階の文字列条件チェックの通過有無フラグ
		int progress = 0;
		//正規表現パターン初期化
		String ptn;
		//判定パターン生成
		Pattern p;

		//照合パターン１
		//英字と数字だけで構成された6文字以上かどうか
		ptn = "^[a-zA-Z0-9].*$";
		if(str.matches(ptn)) {
			progress = 1;
			System.out.println(progress);
		}
		
		//英字と数字を各1字以上含む ※これ単体では記号等を含む文字列もOkになる
		//ptn = "[[a-zA-Z]+[0-9]+"; 
		//同じ文字が3文字以上連続する場合ヒットする正規表現
		ptn = "(.)\\1{2,}"; //(.)\1\1も同じ

		return result;
	}
}