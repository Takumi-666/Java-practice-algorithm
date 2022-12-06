
public class Practice5 {

	public static void main(String[] args) {
		
		int ans = 0;
		
		Businessmen2 tarou2 = new Businessmen2("太郎",20,33);
		
		tarou2.introduction();
		//ans = tarou2.salary;
		
		ans = tarou2.getsalary();
		
		System.out.println("給料は"+ ans +"円です。");

	}

}

/*演習問題．５
【作成するプログラムの仕様】
「演習問題.３」で作成したBusinessmenクラスに対してカプセル化とコンストラクトを追加した、
Businessmen2クラスを作成する
・メンバ変数である給料をカプセル化してアクセッサメソッドを作成する。
・コンストラクタを使⽤して名前と給料の初期値を設定する。
・ mainメソッドのあるクラスを準備して、 Businessmen2クラスをインスタンス化する。
・自己紹介メソッドを実施する。
・アクセッサメソッドを使⽤して給料を変更する。
・アクセッサメソッドを使⽤して給料を取得する。
・取得した給料を画⾯上に表⽰する。
*/