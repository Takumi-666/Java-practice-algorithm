import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("整数1:");
			int a =sc.nextInt();
			
			System.out.print("整数2:");
			int b =sc.nextInt();
			
			sc.close();
			
			int c = a - b;
			int d = c* -1;
			
			if( c >= 0 ) {
				System.out.println("それらの差は"+c+"です");
			}
			
			else {
				System.out.println("それらの差は"+d+"です");
			}
	}		

}

/*演習問題．５
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から２つの整数値を読み込んで、
それらの値の差を求めて画面上に表示するプログラムを作成する

例
２つの整数を入力してください。
整数１：6
整数２：12
それらの差は6です。
*/