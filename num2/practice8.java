import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("整数を入力してください:");
		int a =sc.nextInt();
		
		int sum = 0;
		
		sc.close();
		
		if( a > 0  ) {
			for (int i = 1; i < a; i++) {
				sum += i;
			  /*良く使う論理！！！！
			    sum = sum +i
				sumには今までの合計値が入っている
				入力した数字が4の時
				初期値 sum = 0
				1回目　sum = 0+1 =1
				2回目  sum = 1+2 =3
				3回目  sum = 3+3 =6
				4回目  sum = 6+4 =10
				*/
				
			}
			System.out.println("1からの和は"+sum+"です");
		}
		else  {
			System.out.println("入力値は誤りです。");
		}
		
	}

}

/*演習問題．８
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から正の整数値を読み込んで、
１から読み込んだ整数値までの和をもとめて、画面上に表示する
プログラムを作成する。
※for⽂を使⽤してプログラムを作成する。
※0以下が⼊⼒された場合、「⼊⼒値は誤りです。」と表示して
プログラムを終了する。

例
正の整数を入力してください：5
１からの和は15です。
*/