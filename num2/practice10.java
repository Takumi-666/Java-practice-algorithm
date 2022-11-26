import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("正の整数を入力してください:");
		int a =sc.nextInt();
		
		sc.close();
		
		int i = 0;
		
		if( a >= 0  ){
			while ( i < a){
				System.out.print(a + " ");//" "でスペースをつける。これやると見やすくなる。
				a = a+2;
			}
			
		}
		else  {
			System.out.println("入力値は誤りです。");
		}
		
	}

}

/*演習問題．10
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から正の整数値を読み込んで、
読み込まれた整数値以下である正の偶数を順番に画面上に表示する
プログラムを作成する。
※while⽂を使⽤してプログラムを作成する。
※0以下が⼊⼒された場合、「⼊⼒値は誤りです。」と表示して
プログラムを終了する。

例
正の整数を入力してください：19
2 4 6 8 10 12 14 16 18
*/