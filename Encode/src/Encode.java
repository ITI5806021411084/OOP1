//Encode OOP-Ass2
import java.util.Scanner;
public class Encode {

	public static void main(String[] args) {			
		String Upper;	
		Upper = getMessage();
		Finish(Upper);
	}
	
	public static String getMessage(){
		String Convert;
		String message;
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter Message : ");		
		message = scan.nextLine();
		
		Convert=message.toUpperCase();
		
		return(Convert);
		
	}
	
	public static void Finish(String Upper){
		char c;
		for(int i=Upper.length()-1;i>=0;i--)
		{
		c=Upper.charAt(i);
		if(c=='R'){c='E';}
		else if(c=='W'){c='R';}
		else if(c=='E'){c='W';}
		
			if(i==Upper.length()-1) System.out.print("Decode finish is : ");
			
		System.out.print(c);
		}
	}
}