import java.util.Scanner;


public class T3_2 {
 
	public static void main(String[] args) {
		 Scanner in  = new Scanner(System.in);
		 String id = in.next();
		 String pass = in.next();
		 boolean flag1 = true;
		 boolean flag2 =true;
		 if(id.length()>8){
			 flag1 = false;
		 }
		 for(int i = 0 ;i<id.length();i++){
			 if(Character.isLetterOrDigit(id.charAt(i))==false){
				 flag1 =false;
				 break;
			 }
		 }
		 if(pass.length()>8||pass.length()<6){
			 flag2=false;
		 }
		 if(flag1==true&&flag2==true){
			 System.out.print("符合標準");
		 }else if(flag1==false && flag2==true){
			 System.out.print("username格式不合");
		 }else if(flag1==true && flag2==false){
			 System.out.print("password格式不合");
		 }else{
			 System.out.print("兩者條件皆不合");
		 }


	}

}
