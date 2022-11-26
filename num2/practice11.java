public class practice11 {
    public static void main(String[] args) {
        int max = 5;
        String star = "*";

        //大枠の5回ループ
        for (int i = 0; i < max; i++) {
        	//スペースを入れるループ 
            for (int j = 0; j < max-i; j++) {
                System.out.print(" ");
            }
            //*を入れるループ　
            for (int k = 0; k <= i; k++){
                System.out.print(star);
            }
            System.out.println("\n");
        }
    }
}

//スペースと*がどういう規則で増えたり減ったりしているかをつかむ

/*演習問題．1１
【作成するプログラムの仕様】
●下に示すようにコンソール画面上から正の整数値を読み込んで、
読み込まれた整数値分の直角二等辺三角形を画面上に表示するプログラム
を作成する。
※正の整数の上限値は10とする。
※0以下が⼊⼒された場合、「⼊⼒値は誤りです。」と表示して
プログラムを終了する。

例
直角二等辺三角形作成します。
短辺：5
     *

    **

   ***

  ****

 *****

*/