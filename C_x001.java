package paiza;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*	入力文字列が以下の条件を全て満たすか判定する
 * ・長さが 6 以上
 * ・英字と数字の両方を含む必要がある
 * ・同じ文字を 3 つ以上連続で使用することはできない
 * ※上記全てを正規表現一行だけで実現するのは難解なので分解する
 */
public class C_x001 {

	public static void main(String[] args) {

		//判定文字列
		//入力例：7Caaad9 -> "Invalid", DjZGrduN8Mj4 -> "Valid"
		String str = new Scanner(System.in).nextLine();
		//全ての条件に合致したかの判定結果
		System.out.println(judge(str));
	}

	//渡された文字列が全ての条件に合致するか判定するメソッド
	public static String judge(String str) {
		//与えられた文字列が全ての条件をクリアしていれば"Valid"を返す
		String result = "Invalid";

/*条件０.6文字以上かチェック(条件２の正規表現チェックで同時に可能)
		if (str.length() < 6) {
			return "Invalid";
		}
*/

		//条件１．全て半角英数字のみで構成された文字列か
		// 正規表現のパターン１を作成
		String pattern = "^[a-zA-Z0-9]+$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		if (!m.find()) {
			return result; //"Invalid" ※最下部の記述と重複処理1
		}

		//条件２.英字と数字の両方を含む６文字以上か
		pattern = "^(?=.*[a-zA-Z])(?=.*[0-9]).{6,}";
		p = Pattern.compile(pattern);
		m = p.matcher(str);
		if (!m.find()) {
			return result; //"Invalid" ※最下部の記述と重複処理2
		}

		//条件３．同じ文字が３回以上連続使用されていないか
		pattern = "^.*(.)\\1{2,}.*$";
		p = Pattern.compile(pattern);
		m = p.matcher(str);
		if (!m.find()) {
			//ここは正規表現マッチ「しない」が条件クリアなので注意
			result = "Valid";
		} else {
			return result; //"Invalid" ※最下部の記述と重複処理3
		}
		return result;
	}
}