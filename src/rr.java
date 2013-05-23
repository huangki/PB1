import java.util.Arrays;
import java.util.Scanner;


public class rr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner input = new Scanner(System.in);

		
		
		System.out.println("請輸入第一串資料:");
		
		
		
	
			int a[]= new int [10];
			int b[]= new int [5];
			int c[]= new int [5];
			
		for( int i=0;i<5;i++){
			 b[i]=input.nextInt();
			 a[i]=b[i];
		
		}
			 
		System.out.println("請輸入第二串資料:");

		
		
		for(int i=0;i<5;i++){
			c[i]=input.nextInt();
			a[i+5]=c[i];
		}
		   
		
		  for(int j =0;j<10;j++){
		System.out.print(a[j]+" ");
		  }
		  
		  sort(a);

	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		   Arrays.sort(a);
           for(int i =0;i<10;i++)
                System.out.print(a[i]+"  ");
	}

}
