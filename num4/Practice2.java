
public class Practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JapanForm Jap = new JapanForm();
		AmericaForm Ame = new AmericaForm();
		
		Jap.greet();
		Ame.greet();

	}

}

/*
演習問題．２
【作成するプログラムの仕様】
・プロジェクトを作成し、生活クラスと日本様式クラスとアメリカ様式クラスと挨拶インタフェースを実装する。
① Greetingインターフェースを作成（宣言）する。
⇒インターフェース名はGreetingとする。
⇒挨拶をするメソッドを⽤意する。⇒void greet()
② 日本様式クラスを作成しクラス名はJapanFormとする。
⇒日本様式クラスはGreetingインタフェースをimplimentsする。
⇒greetメソッドをオーバーライドし、内容は画面上に「こんにちは」と表示する処理を作成する。
③ アメリカ様式クラスを作成しクラス名はAmericaFormとする。
⇒アメリカ様式クラスはGreetingインタフェースをimplimentsする。
⇒greetメソッドをオーバーライドし、内容は画面上に「Hello」と表示する処理を作成する。
④生活クラスを作成しクラスはLife（今回はPractice2）とする。
⇒メインメソッドを作成する。
⇒日本様式クラスをインスタンス化し、greetメソッドを実施する。
⇒アメリカ様式クラスをインスタンス化し、greetメソッドを実施する。
*/