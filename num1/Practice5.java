import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a;
		
		System.out.print("長さをcmで入力してください:");
		double number =sc.nextDouble();
		
		sc.close();
		
		a = number /2.54; //単位をインチへ変換
		System.out.println("それは"+ a+"インチです。");
		
		
	}

}

/*演習問題．５
【作成するプログラムの仕様】
●下に示すように、cmの単位で読み込んだ⻑さを、インチに変換した値を表示する
プログラムを作成する。
※1インチは2.54cmとする。

例
⻑さをcmで入力してください：25.4
それは10.0インチです
*/