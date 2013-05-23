import java.util.Arrays;
import java.util.Scanner;

public class A6_19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		if (isSorted(A) == true) {
			System.out.print("This list is sorted");
		} else {
			System.out.print("This list is not sorted");

		}
	}

	private static boolean isSorted(int[] a) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		Arrays.sort(a);
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			if (b[i] != a[i]) {
				flag = false;
				break;
			}

		}

		return flag;

	}

}
