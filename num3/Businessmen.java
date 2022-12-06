
public class Businessmen {
	  //メンバ変数（クラスの情報として必要な情報）
	  String name = "井上";
	  String grade = "一般社員";
	  int id = 10;
	  int age = 22;
	  int salary = 300000;
	 
	  void introduction(){
		  System.out.println( "私の名前は" +name+ "です" );
		  System.out.println( "私の社員番号は"+id+"です" );
		  System.out.println( "私の年齢は"+age+"です" );
	  }
	  void ageAdd(){
		  age +=1;//age = age + 1
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
続き→Practice３
*/