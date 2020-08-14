package localinnerclass;

public class Main {

	public static void main(String[] args) {
		Machine m = new Machine();
		m.start();
	}
}

class Machine{
	public void start() {
		System.out.println("スタトメソツド!");
		class Phone{
			public void start() {
				System.out.println("携帯電話のメソツド");
			}
		}
		
		Phone p = new Phone();
		p.start();
	}
	
	class Camera{//メンバーの内部クラス
		public void snap() {
			System.out.println("カメラで写真を撮ります。");
		}
	}
}
