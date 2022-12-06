
public class Earth {

	public static void main(String[] args) {
		
		//動物クラスのインスタンス化
		Animal ani = new Animal();
		//歩くメソッドの実行
		ani.walk();
		
		//人間クラスのインスタンス化
		Human hm = new Human();
		//歩くメソッドの実行
		hm.walk();
		//話すメソッドの実行
		hm.speak();
		
		//会社員クラスのインスタンス化
		Businessmen  bm = new Businessmen();
		//歩くメソッドの実行
		bm.walk();
		//話すメソッドの実行
		bm.speak();
		//打ち合せメソッドの実行
		bm.work();
	}

}
