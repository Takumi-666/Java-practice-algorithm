
public class Practice1 {

	public static void main(String[] args) {
		
		Fireengine Fire  = new Fireengine();
		
		Fire.carInfo();
		Fire.carplay();
		Fire.carstop();
		Fire.extinction();
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

④消防⾞クラスを作成（宣言）する。
⇒クラス名はFireengineとする。
⑤消防⾞クラスは⾞クラスから継承して作成する。
⑥消防⾞クラスに追加する操作（メソッド）を作成する。
⇒消火するメソッドを⽤意して作成する。⇒void extinction ()
●「消火します。」と画面上に表示する。
⇒消防⾞の情報を表示するメソッドを⽤意して作成する。⇒void carInfo()
●「消防⾞の⾞種はELFです。 」と画面上に表示する。

 mainメソッドのあるクラスを準備して、消防⾞クラスをインスタンス化する。
・ mainメソッドのあるクラスを準備して、消防⾞クラスのメソッドを実⾏する。
⑦消防⾞の情報を表示する
⑧消防⾞発進（動かす）
⑨消防⾞停止
⑩消防⾞の消火メソッドの実⾏
*/