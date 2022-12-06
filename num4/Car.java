
public class Car {
	String carName = "Honda";
	
	void carInfo(){
		System.out.println("車の車種は"+carName+"です。");
	}
	void carplay() {
		System.out.println("発信して動きます。");
	}
	void carstop() {
		System.out.println("止まります。");
	}
}


/*練習問題１
作成するプログラムの仕様】
・Carクラス(⾞)とCarクラスを継承したFireengineクラス(消防⾞)を作成し、
2つのクラスを動作させる。
①⾞クラスを作成（宣言）する。
⇒クラス名はCarとする。
②⾞クラスに必要な情報（変数）を作成する。
⇒String型で⾞種を格納のする変数（carName）を⽤意して名前を設定する。
③⾞クラスに必要な操作（メソッド）を作成する。
⇒⾞の情報を表示するメソッドを⽤意して作成する。⇒void carInfo()
●「⾞の⾞種はｘｘｘｘです。」と画面上に表示する。
⇒発進する（動かす）メソッドを⽤意して作成する。⇒void carplay()
●「発進して動きます」と画面上に表示する。
⇒停止するメソッドを⽤意して作成する。⇒void carstop()
●「止まります」と画面上に表示する。
*/