import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class T3_1 {
 
	public static void main(String[] args) throws FileNotFoundException {
	 File f = new File("C:\\input\\quiz_1.txt");
	 Scanner in =  new Scanner(f);
	 System.out.println("請入會員ID:");
	 Scanner in1 = new Scanner(System.in);
	String id = in1.next();
	 System.out.println("  ID  NAME  生日       血型     性別");
	 int num =0;
	 String s,s1,s2,s3,s4;
	 boolean flag = false;
	 while(in.hasNext()){
		 s = in.next();
		 s1 = in.next();
		 s2 = in.next();
		 s3 = in.next();
		 s4 = in.next();
		 if(id.equals(s)){
			 flag = true;
			 System.out.print(s+" "+s1+" "+s2+" "+s3+"   "+s4);
			 break;
		 }
	 }
	 if(flag==false){
		 System.out.print("無此人");
	 }
	}

}
