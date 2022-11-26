import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("整数1:");
		int a =sc.nextInt();
		
		System.out.print("整数2:");
		int b =sc.nextInt();
		
		System.out.print("整数3:");
		int c =sc.nextInt();
		
		sc.close();
		
		if( b > a && c > a ) {
			System.out.println("最小値は"+a+"です");
		}
		if( a > b && c > b ) {
			System.out.println("最小値は"+b+"です");
		}
		if( a > c && b > c ) {
			System.out.println("最小値は"+c+"です");
		}
	}

}

/*演習問題．３
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から３つの整数値を読み込んで、
その最小値を求めて画面上に表示するプログラムを作成する。
3つの整数を有力してください。

例
整数1：47
整数2：84
整数3：21
最小値は21です
*/