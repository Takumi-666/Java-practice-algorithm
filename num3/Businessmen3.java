
public class Businessmen3 {
	  //メンバ変数（クラスの情報として必要な情報）
	  String name ;
	  int id ;
	  int age ;
	  private String grade;
	  private int salary = 300000;
	 
	  Businessmen3( String name, int id, int age, String grade ){
		  this.name = name;
		  this.id = id;
		  this.age = age;
	  }
	  void introduction(){
		  System.out.println( "私の名前は" +name+ "です" );
		  System.out.println( "私の社員番号は"+id+"です" );
		  System.out.println( "私の年齢は"+age+"です" );
		  System.out.println("役職は"+ grade);
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
	  
	  void setgrade(String grade) {
		  this.grade = grade;
	  }
	  
	  String getgrade() {
		  return grade;
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