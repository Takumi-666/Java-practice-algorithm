import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("何月ですか:");
		int number =sc.nextInt();
		
		sc.close();
		
		switch(number){
		case 3:
		case 4:
		case 5:
			System.out.print("春です");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("夏です");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("秋です");
			break;
		case 12:
		case 1:
		case 2:
			System.out.print("冬です");
			break;
		default:
			System.out.print("そんな月はありません");
		}

	}

}

/*演習問題．７
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から月を整数値を読み込んで、
その季節を画面上に 表示するプログラムを作成する。
※switch⽂を使⽤してプログラムを作成する。
※3⽉〜5⽉の場合、「春です。」と表示する。
6⽉〜8⽉の場合、「夏です。」と表示する。
9⽉〜11⽉の場合、「秋です。」と表示する。
12⽉〜2⽉の場合、「冬です。」と表示する。
1⽉から12⽉以外が⼊⼒された場合、
「そんな⽉はありません。」と表示する。

例
何月ですか：5
春です。

*/