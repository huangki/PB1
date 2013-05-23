import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class code {

	public static void main(String[] args) {
		System.out.println("請輸入一個正整數:");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if (a <= 0) {
			System.out.println("此數字無效");
		} else {
			String s = Integer.toBinaryString(a);
			double count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					count++;
				}
			}
			System.out.printf("%.3f", (count / s.length()));
		}
	}

}
