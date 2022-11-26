import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("整数A:");
		int a =sc.nextInt();
		
		System.out.print("整数B:");
		int b =sc.nextInt();
		
		int c; 
		int d;
		
		c = (a + b)/2 ;
		d = c*-1 ;  //符号反転　良く使う論理！！！
		
		sc.close();
		
		System.out.println("平均にの符号を反転した値は"+ d+"です。");
		
	}

}

/*演習問題．３
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から読み込んだ二つの整数値に対して、その平均値の
符号を反転した値を表示するプログラムを作成する。
※変数は全てint型で作成する

例
二つの整数を入力してください。
整数A：40
整数B：45
平均値の符号を反転した値は-42です
*/