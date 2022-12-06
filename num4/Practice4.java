import java.util.HashMap;

public class Practice4 {
	public static void main(String[] args) {
	HashMap<String,String> map = new HashMap <String,String>();
	
	map.put("NAME1","tarou");
	map.put("NAME2","jirou");
	map.put("NAME3","kennji");

	HashMap<String,Integer> map2 = new HashMap <String,Integer>();
	map2.put("NUM1",5517);
	map2.put("NUM2",-1972);
	map2.put("NUM3",246);
	
	String temp =map.get("NAME1");
	System.out.println(temp);
	temp =map.get("NAME2");
	System.out.println(temp);
	temp =map.get("NAME3");
	System.out.println(temp);
	Integer temp1 =map2.get("NUM1");
	System.out.println(temp1);
	temp1 =map2.get("NUM2");
	System.out.println(temp1);
	temp1 =map2.get("NUM3");
	System.out.println(temp1);
	}
}

/*演習問題．４
【作成するプログラムの仕様】
・つぎの値をHashMapに格納し、格納した値を取得し画面に表示するプログラムを作成する。
※キーは任意でつけてみてください。
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