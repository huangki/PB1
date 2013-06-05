import java.util.Scanner;

public class letter {
	 
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("請輸入四個位元的數字: ");
		String instr = in.next();
		
		

		while (instr.length() > 4 || instr.length() <= 3) {
			System.out.println("格式錯誤，請重新輸入!!\n");
			System.out.print("請輸入四個位元的數字: ");
			instr = in.next();
		}
		int num;
		char[] s = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		char str;
        String outstr ="";
		for (int i = 0; i < instr.length(); i++) {
			str = instr.charAt(i);
			num = (int) (str - 48);
			if (num >= 0 && num < 10) {
				outstr += s[num];
			} else {
				System.out.println("格式錯誤，請重新輸入!!\n");
				instr = in.next();
				break;
			}


		}

		if (outstr.length() == 4)
			System.out.println("轉換結果為: " + outstr);

	}

}
