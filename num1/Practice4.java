import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a;
		
		System.out.print("実数を入力してください:");
		double number =sc.nextDouble();
		
		sc.close();
		
		a = number + 0.1;
		System.out.println("0.1を加えると"+ a+"です。");
		a = number - 0.1;
		System.out.println("0.1を減じると"+ a+"です。");
		a = number * 0.1;
		System.out.println("0.1を乗じると"+ a+"です。");
		a = number / 0.1;
		System.out.println("0.1で除すと"+ a+"です。");
		
	}

}

/*演習問題．４
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から読み込んだ実数値（小数）に対して、
0.1を加えた値、減じた値、乗じた値、除した値を表示するプログラムを作成する。

例
実数を入力してください：13.57
0.1を加えると13.67です。
0.1を減じると13.47です。
0.1を乗じると1.3570000000000002です。
0.1で除すと135.7です
*/