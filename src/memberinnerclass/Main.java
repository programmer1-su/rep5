package memberinnerclass;

public class Main {

	public static void main(String[] args) {
		Machine m = new Machine();
		m.start();
		
		Machine.Camera mc = m.new Camera();//直接snapメソツドを呼ぶ
		mc.snap();
		
		Machine.Camera1 mc1 = new Machine.Camera1();//static キーワードがあるクラスなら
		mc1.snap();
	}

}

class Machine{
	public String name = "携帯電話";
	
	public void start() {
		System.out.println(name);
		Camera c = new Camera();
		c.snap();
	}
	
	class Camera{//メンバーの内部クラス
		public void snap() {
			System.out.println("カメラで写真を撮ります。");
		}
	}
	
	static class Camera1{//メンバーの内部クラス
		public void snap() {
			System.out.println("カメラ1で写真を撮ります。");
		}
	}
	
}
