
public class Practice3 {
	public static void main(String[] args) {
		//インスタンス化
		Businessmen  inoue = new Businessmen();
		
		inoue.introduction();
		inoue.ageAdd();
		inoue.introduction();

	}

}

/*演習問題．３
【作成するプログラムの仕様】
・Businessmenクラス（会社員クラス）を作成する。
①クラスを作成（宣言）する。
⇒クラス名はBusinessmenとする。
②クラスに必要な情報（変数）を作成する。
⇒String型で名前を格納のする変数（name）を⽤意して名前を設定する。
⇒int型で社員番号を格納する変数（id）を⽤意して「10」を設定する。
⇒int型で年齢を格納する変数（age）を⽤意して22歳を設定する。
⇒String型で役職を格納する変数（grade）を⽤意して「⼀般社員」
を設定する。
⇒int型で給料を格納する変数（salary）を⽤意して「300000」
を設定する。 50
③クラスに必要な操作（メソッド）を作成する。
⇒自己紹介メソッドを⽤意して作成する。
⇒void introduction()
●「私の名前はｘｘｘｘです。」
「私の社員番号はｘｘです。」
「私の年齢はｘｘ歳です。」と画面に表示する。
⇒年齢加算メソッドを用意して作成する。
⇒void ageAdd()
●年齢に1を加算する。
・ mainメソッドのあるクラスを準備して、 Businessmenクラスを
インスタンス化する。
・ mainメソッドのあるクラスを準備して、 Businessmenクラスのメソッド
を
実行する。
①自己紹介メソッドの実行
②年齢加算メソッドの実行
③自己紹介メソッドの実行
*/