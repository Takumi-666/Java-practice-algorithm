
public class Practice4 {

	public static void main(String[] args) {
		//インスタンス化
		Businessmen  tanaka = new Businessmen();
		Businessmen  aoki = new Businessmen();
		Businessmen  yamada = new Businessmen();
		
		tanaka.age = 25;
		tanaka.name ="tanaka";
		tanaka.introduction();
		aoki.age = 30;
		aoki.name ="aoki";
		aoki.introduction();
		yamada.age = 35;
		yamada.name ="yamada";
		yamada.introduction();
		

	}

}

/*演習問題．４
【作成するプログラムの仕様】
・「演習問題.３」で作成したBusinessmenクラスを３つ（３人分）
インスタンス化する。
⇒クラスに必要な情報（変数）は年齢以外は任意で設定する。
⇒ １人目は25歳、2人目は30歳、3人目は35歳
・ mainメソッドのあるクラスを準備して、 １人目は26歳、２人目は31歳、
3人目は37歳となるように年齢加算メソッドを処理し、最後に自己紹介を
実施する。
※役職、給料は初期値のまま変更しなくても良いです。
*/

