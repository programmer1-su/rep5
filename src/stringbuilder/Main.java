package stringbuilder;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("太陽が毎日元気だから、");
		sb.append("暑くてみんな困っている。");
		String str = sb.toString();
		System.out.println(str);
	}

}
