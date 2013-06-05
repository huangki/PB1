import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class T3_3 {
 
	public static void main(String[] args) throws FileNotFoundException {
		 File f = new File("C:\\input\\quiz_2.txt");
		 Scanner in = new Scanner(f);
		 double w,h;
		 int n = 0;
		 int c1 = 0,c2 = 0,c3 = 0,c4 = 0;
		 while(in.hasNext()){
			 n=in.nextInt();
			 h=in.nextDouble();
			 w=in.nextDouble();
			  double bmi =w/((h/100.0)*(h/100.0));
			  float   b   =   (float)(Math.round(bmi*10))/10;
			 // System.out.println(b);  檢查用的:XD
			  if(b<18.5){
				  c4++;
			  }else if(b>=18.5&&b<=24.9){
				  c3++;
			  }else if(b>=25&&b<=29.9){
				  c2++;
			  }else {
				  c1++;
			  }
		 }
		 System.out.print("肥胖 ");
		 for(int i = 0;i<c1;i++){
			System.out.print("*");
		 }System.out.println();
		
		 System.out.print("過重 ");
		 for(int i = 0;i<c2;i++){
			 System.out.print("*"); 
		 }System.out.println();
		 
		 System.out.print("標準 ");
		 for(int i = 0;i<c3;i++){
			 System.out.print("*");
		 }System.out.println();
		 
		 System.out.print("過輕 ");
		 for(int i = 0;i<c4;i++){
			 System.out.print("*");
		 }System.out.println();

	}

}
