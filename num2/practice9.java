import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("正の整数を入力してください:");
		int a =sc.nextInt();
		
		sc.close();
		
		if( a >0  ) {
			for (int i = 0; i < a; a--){
				System.out.print(a + " ");
			}
			
		}
		else  {
			System.out.println("入力値は誤りです。");
		}
		
	}

}

/*演習問題．９
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から正の整数値を読み込んで、
１までカウントダウンするプログラムを作成する。
※for⽂を使⽤してプログラムを作成する。
※0以下が⼊⼒された場合、「⼊⼒値は誤りです。」と表示して
プログラムを終了する。

例
正の整数を入力してください：11
11 10 9 8 7 6 5 4 3 2 1
*/