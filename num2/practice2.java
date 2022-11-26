import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("整数A:");
		int a =sc.nextInt();
		
		System.out.print("整数B:");
		int b =sc.nextInt();
		
		sc.close();
		
		if( a == b ) {
			System.out.println("AとBは等しいです。");
		}
		else if( a > b ) {
			System.out.println("AはBより大きいです。");
		}
		else  {
			System.out.println("AはBより小さいです。");
		}
	}

}

/*演習問題．２
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から２つの整数値を読み込んで、
２つの値が等しい場合、「AとBは等しいです。」と、
Aのほうが大きければ「AはBより大きいです。」と、
Bのほうが大きければ「AはBより小さいです。」と表示するプログラムを作成する

例
実行例．１
２つの整数を入力してください。
整数A： 10
整数B： 10
AとBは等しいです。

実行例．２
２つの整数を入力してください。
整数A： 25
整数B： 10
AはBより大きいです

実行例．3
２つの整数を入力してください。
整数A： 8
整数B： 20
AはBより小さいです。
3
*/