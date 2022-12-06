
public class Car2 implements Power, Audio {
	public void powerstart(){
		System.out.println("発進します。");
	}
	public void powerstop(){
		System.out.println("停止します。");
	}
	public void playstart(){
		System.out.println("音楽を再生します。");
	}
	public void playstop(){
		System.out.println("音楽を停止します。");
	}
}