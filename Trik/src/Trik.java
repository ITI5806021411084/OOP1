import java.util.Scanner;

public class Trik {
	  public static void main(String[] args) {
			int L=1,C=0,R=0,temp,i;
			String glass;
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Data :");
			glass = scan.next();
			
			for(i=0;i<glass.length();i++){
				if(glass.charAt(i) == 'A' || glass.charAt(i) == 'a'){
					temp=L;
					L=C;
					C=temp;
				}else if(glass.charAt(i) == 'B' || glass.charAt(i) == 'b'){
					temp=C;
					C=R;
					R=temp;
				}else{
					temp=L;
					L=R;
					R=temp;
					 }
			}
			if(L == 1) System.out.println("Coin  in Left glass");
			else if(C == 1) System.out.println("Coin  in Center glass");
			else System.out.println("Coin  in Right glass");

	}
}
