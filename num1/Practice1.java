import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("整数を入力してください:");
		int number =sc.nextInt();//入力した数値を変数numberに入れる
		
		sc.close();
		
		a = number + 5;
		System.out.println("5を加えると"+ a+"です。");
		a = number - 5;
		System.out.println("5を減じると"+ a+"です。");
		a = number * 5;
		System.out.println("5を乗じると"+ a+"です。");
		a = number / 5;
		System.out.println("5を除した商は"+ a+"です。");
		a = number % 5;
		System.out.println("5を除した剰余は"+ a+"です。");

	}

}


/* 演習問題．１
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から読み込んだ整数値に対して「5」を加えた値、
減じた値、乗じた値、5で除した商、 5で除した剰余を表示するプログラムを作成する。

例
整数を入力してください：137
5を加えると142です。
5を減じると132です。
5を乗じると685です。
5を除した商は27です。
5を除した剰余は2です。
*/