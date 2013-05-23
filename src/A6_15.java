import java.util.Scanner;

public class A6_15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ten numbers");
		int A[] = new int[10];
		for (int i = 0; i < 10; i++) {
			A[i] = in.nextInt();
		}
		eliminateDuplicates(A);
	}

	private  static  void  eliminateDuplicates(int[] a) {
		System.out.print("The distinct numbers are: "); 
		int B [] = new int[10];
		 for(int i =0;i<10;i++){
			 for(int j =0;j<=i;j++){
				 if(a[i]==B[j]){
					 break;
				 }
				 if(a[i]!=B[j]&&B[j]==0){
					 B[j]=a[i];
					 break;
				 } 
			 }
		 }
		 for(int i =0;i<10;i++){
			 if(B[i]!=0)
			 System.out.print(B[i]+" ");
		 }
	}

}
