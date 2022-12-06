
public class Businessmen2 {
	  //メンバ変数（クラスの情報として必要な情報）
	  String name ;
	  String grade = "一般社員";
	  int id ;
	  int age ;
	  int salary = 300000;
	 
	  Businessmen2( String name, int id, int age ){
		  this.name = name;
		  this.id = id;
		  this.age = age;
	  }
	  void introduction(){
		  System.out.println( "私の名前は" +name+ "です" );
		  System.out.println( "私の社員番号は"+id+"です" );
		  System.out.println( "私の年齢は"+age+"です" );
	  }
	  void ageAdd(){
		  age +=1;//age = age + 1
	  }
	  int getsalary() {
		  return salary;
	  }
	   
	  void setsalary( int num ) {
		  salary = num;
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