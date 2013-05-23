import java.util.Arrays;
import java.util.Scanner;


public class HW3_2 {

	 
	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 System.out.println("請輸入一個最多四位數的正整數(1~9999)");
	 String s = in.next();
	 int A[] = new int[4];
	 for(int i =0;i<s.length();i++){
		 A[i] = s.charAt(i)-'0';
	 }
	 Arrays.sort(A);
	 for(int i = A.length-1;i>=0;i--){
		 System.out.print(A[i]+" ");
	 }
	 

	}

}
