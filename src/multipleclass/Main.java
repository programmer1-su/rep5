package multipleclass;

/*
 * 1.複数のクラスがシングルのJavaファイル内で許可される
 * 2.トップレベルのクラスは1つだけ許可される「public keywordがあるクラス=トップレベルクラス」
 * 3.トップレベルのクラスはJavaファイル名と同じ
 */
class Robot{
	public void doJobWithRobot() {
		System.out.println("ロボットで作業します。");
	}
}

public class Main {

	public static void main(String[] args) {
		new Robot().doJobWithRobot();
		new Machine().doJobWithMachine();
	}

}

class Machine{
	public void doJobWithMachine() {
		System.out.println("機械で作業します。");
	}
}
