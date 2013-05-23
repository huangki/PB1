import java.util.Arrays;
import java.util.Scanner;

public class HW3_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A[] = new int[6];
		int specialnumber = 0;
		for (int i = 0; i <= A.length; i++) {
			if (i < A.length) {
				A[i] = in.nextInt();
			} else {
				specialnumber = in.nextInt();
			}
		}
		int B[] = new int[6];
		for (int i = 0; i < B.length; i++) {
			B[i] = in.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		int specialcount = 0;
		int count = 0;
		for (int i = 0; i < B.length; i++) {
			if (B[i] == specialnumber) {
				specialcount++;
			}
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (B[j] == A[i]) {
					count++;
				}
			}
		}

	 
		System.out.println();
		System.out.print("對中 "+count + "個號碼，特別號 " + specialcount+" 個");
		System.out.println();
		if(count==6){
			System.out.print("頭獎 獎金500000");
		}else if(count==5&&specialcount==1){
			System.out.print("貳獎 獎金100000");
		}else if(count==5 ){
			System.out.print("參獎 獎金50000");
		}else if(count==4&&specialcount==1){
			System.out.print("肆獎 獎金10000");
		}else if(count==4 ){
			System.out.print("伍獎 獎金5000");
		}else if(count==3&&specialcount==1){
			System.out.print("陸獎 獎金1000");
		}else if(count==3 ){
			System.out.print("普獎 獎金300");
		}else{
			System.out.print("沒有中獎");
		}
	}

}
