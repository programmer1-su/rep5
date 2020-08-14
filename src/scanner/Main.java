package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("何歳ですか？");
		int i = scan.nextInt();
		System.out.println(i + "歳です。");
		
		System.out.println("名前はなんですか？");
		String name = scan.nextLine();
		System.out.println(name + "と申します。");
		
	}

}
