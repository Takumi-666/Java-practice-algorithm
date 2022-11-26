import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("整数を入力してください:");
		int number =sc.nextInt();
		
		sc.close();
		
		number += 5;
		System.out.println("5を加えると"+ number+"です。");
		number -= 5;
		System.out.println("5を減じると"+ number+"です。");
		number *= 5;
		System.out.println("5を乗じると"+ number+"です。");
		number /= 5;
		System.out.println("5を除した商は"+ number+"です。");
		number %= 5;
		System.out.println("5を除した剰余は"+ number+"です。");

	}

}

/*演習問題．６
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から読み込んだ整数値に対して「5」を加えた値、
減じた値、乗じた値、5で除した商、 5で除した剰余を表示するプログラムを作成する。
※代入演算子を用いてプログラムを作成する。

例
整数を入力してください：137
5を加えると142です。
5を減じると132です。
5を乗じると685です。
5を除した商は27です。
5を除した剰余は2です
*/
