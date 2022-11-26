import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("整数A:");
		int a =sc.nextInt();
		
		System.out.print("整数B:");
		int b =sc.nextInt();
		
		int c; 
		
		sc.close();
		c = a*100  / b  ;
		
		System.out.println("Aの値はBの"+ c+"%です。");
		
	}

}

/*演習問題．２
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から読み込んだ二つの整数値に対して、前者の値が
後者の何%であるかを表示するプログラムを作成する。
※変数は全てint型で作成する

例
二つの整数を入力してください。
整数A：54
整数B：84
Aの値はBの64%です
*/