
public class Practice6 {

	public static void main(String[] args) {
		Businessmen3 saburou = new Businessmen3("三郎さん" ,21, 35,"一般社員");
		
		saburou.introduction();
		System.out.println();
		saburou.setgrade("主任");
		saburou.setsalary(350000);
		saburou.introduction();
	}

}

/*演習問題．6
【作成するプログラムの仕様】
Businessmen2クラスを流⽤してBusinessmen3クラスを作成する。
・コンストラクタにて年齢、社員番号、役職の初期化処理を追加する。
・役職をカプセル化し、読み書きするアクセッサメソッドを作成する。
・自己紹介メソッドに役職の情報を追加する。 ⇒void introduction()
●「役職はｘｘです。」と画⾯上に表⽰する処理を追加する。
・上記の追加が完了したら、mainメソッドのあるクラスを準備して、
Businessment3クラスをインスタンス化する。
①自己紹介メソッドを実⾏する
②アクセッサメソッドを使⽤して役職と給料を変更する。
③自己紹介メソッドを実⾏する。
*/