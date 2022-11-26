import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("整数を入力してください:");
		int number =sc.nextInt();
		int ans = number % 2;
		
		sc.close();
		
		ans = number % 2;
		
		switch(ans){
		case 0:
			System.out.print("その数は偶数です");
			break;
		case 1:
			System.out.print("その数は奇数です");
			break;
		default:
			System.out.print("処理異常です");
		}

	}

}

/*演習問題．６
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から整数値を読み込んで、その整数値が
奇数であるか、 偶数であるかを画面上に表示するプログラムを作成する。
※switch⽂を使⽤してプログラムを作成する。

例
整数を入力してください：5
その数は奇数です。

整数を入力してください：4
その数は偶数です
*/