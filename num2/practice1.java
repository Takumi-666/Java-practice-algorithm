import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("整数を入力してください:");
		int number =sc.nextInt();
		
		sc.close();
		
		if( number>0 ) {
			System.out.println("入力した値は正です。");
		}
	}

}

/*演習問題．１
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から整数値を読み込んで、
その値が正の整数であれば画面上に「⼊⼒した値は正です。」
と表示するプログラムを作成する。

例
整数を入力してください:10
入力した値は正です。
*/ 
