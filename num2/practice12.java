public class practice12 {

    public static void main(String args[]){
        // 九九の計算
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
         // 変数mに掛け算の結果を代入
		int m = i * j;
		    
		System.out.print(" ");
		
		//一桁の時スペース1つ追加
		if(10 > m) {
        System.out.print( " " );
		}

		System.out.print(m);
	    }
	    // 改行
	    System.out.println();
        }
    }
}

/*演習問題．1２
【作成するプログラムの仕様】
●下に示すようにコンソール画面上に九九の表を表示するプログラムを作成する。

出力例
  1  2  3  4  5  6  7  8  9
  2  4  6  8 10 12 14 16 18
  3  6  9 12 15 18 21 24 27
  4  8 12 16 20 24 28 32 36
  5 10 15 20 25 30 35 40 45
  6 12 18 24 30 36 42 48 54
  7 14 21 28 35 42 49 56 63
  8 16 24 32 40 48 56 64 72
  9 18 27 36 45 54 63 72 81


*/