import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("整数を入力してください:");
		int number =sc.nextInt();
		
		sc.close();
		
		//偶数、奇数の判定　
		if( number % 2 == 0 ) {
			System.out.println("その数は偶数です。");
		}
		
		else{
			System.out.println("その数は奇数です。");
		}
	}

}

/*演習問題．４
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から整数値を読み込んで、その整数値が
奇数であるか、偶数であるかを画面上に表示するプログラムを作成する。

例
整数を入力してください：17
その数は奇数です。

整数を入力してください：18
その数は偶数です
*/