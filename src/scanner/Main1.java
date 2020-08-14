package scanner;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//システム入力スキャナー
		boolean bol = true;
		int total = 0;
		int count = 0;
		while(bol) {
			total += scan.nextInt();
			count++;
			if(count == 2) {
				bol = false;
			}
		}
		System.out.println("Total is " + total);
	}

}
