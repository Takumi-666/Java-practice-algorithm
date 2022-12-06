import java.util.ArrayList;

public class Practice3 {
	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList <String>();
	
	list.add("tarou");
	list.add("jirou");
	list.add("kennji");

	ArrayList<Integer> list2 = new ArrayList <Integer>();
	list2.add(5517);
	list2.add(-1972);
	list2.add(246);
	
	for (int i=0; i<3; ++i) {
	String temp =list.get(i);
	Integer temp2 =list2.get(i);
	System.out.println(temp);
	System.out.println(temp2);
	}
}}

/*演習問題．３
【作成するプログラムの仕様】
・つぎの値をArrayListに格納し、格納した値を取得し画面に表示するプログラムを作成する。
①文字列を格納するリスト
【格納する値】
tarou
jirou
kennji
②数値（Integer型）を格納するリスト
5517
-1972
246
*/