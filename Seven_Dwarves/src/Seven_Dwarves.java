import java.util.Scanner;

public class Seven_Dwarves {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int k1,k2,k3,k4,k5,k6,k7,k8,k9;
		
		//Scanner scan = new Scanner (System.in);
		System.out.println("Program See Seven Dwarves");
		System.out.print("Enter Number Dwarves1 : ");
		k1 = scan.nextInt();
		System.out.print("Enter Number Dwarves2 : ");
		k2 = scan.nextInt();
		System.out.print("Enter Number Dwarves3 : ");
		k3 = scan.nextInt();
		System.out.print("Enter Number Dwarves4 : ");
		k4 = scan.nextInt();
		System.out.print("Enter Number Dwarves5 : ");
		k5 = scan.nextInt();
		System.out.print("Enter Number Dwarves6 : ");
		k6 = scan.nextInt();
		System.out.print("Enter Number Dwarves7 : ");
		k7 = scan.nextInt();
		System.out.print("Enter Number Dwarves8 : ");
		k8 = scan.nextInt();
		System.out.print("Enter Number Dwarves9 : ");
		k9 = scan.nextInt();	
		
				if(k3+k4+k5+k6+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf1 & Dwarf2");
				else if(k2+k4+k5+k6+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf1 & Dwarf3");
				else if(k3+k2+k5+k6+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf1 & Dwarf4");
				else if(k3+k4+k2+k6+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf1 & Dwarf5");
				else if(k3+k4+k5+k2+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf1 & Dwarf6");
				else if(k3+k4+k5+k6+k2+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf1 & Dwarf7");
				else if(k3+k4+k5+k6+k7+k2+k9==100)
				System.out.print("Fake Dwarf is Dwarf1 & Dwarf8");
				else if(k3+k4+k5+k6+k7+k8+k2==100)
				System.out.print("Fake Dwarf is Dwarf1 & Dwarf9");
				else if(k1+k4+k5+k6+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf2 & Dwarf3");
				else if(k3+k1+k5+k6+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf2 & Dwarf4");
				else if(k3+k4+k1+k6+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf2 & Dwarf5");
				else if(k3+k4+k5+k1+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf2 & Dwarf6");
				else if(k3+k4+k5+k6+k1+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf2 & Dwarf7");
				else if(k3+k4+k5+k6+k7+k1+k9==100)
				System.out.print("Fake Dwarf is Dwarf2 & Dwarf8");
				else if(k3+k4+k5+k6+k7+k8+k1==100)
				System.out.print("Fake Dwarf is Dwarf2 & Dwarf9");
				else if(k1+k2+k5+k6+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf3 & Dwarf4");
				else if(k1+k4+k2+k6+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf3 & Dwarf5");
				else if(k1+k4+k5+k2+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf3 & Dwarf6");
				else if(k1+k4+k5+k6+k2+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf3 & Dwarf7");
				else if(k1+k4+k5+k6+k7+k2+k9==100)
				System.out.print("Fake Dwarf is Dwarf3 & Dwarf8");
				else if(k1+k4+k5+k6+k7+k8+k2==100)
				System.out.print("Fake Dwarf is Dwarf3 & Dwarf9");
				else if(k3+k1+k2+k6+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf4 & Dwarf5");
				else if(k3+k1+k5+k2+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf4 & Dwarf6");
				else if(k3+k1+k5+k6+k2+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf4 & Dwarf7");
				else if(k3+k1+k5+k6+k7+k2+k9==100)
				System.out.print("Fake Dwarf is Dwarf4 & Dwarf8");
				else if(k3+k1+k5+k6+k7+k8+k2==100)
				System.out.print("Fake Dwarf is Dwarf4 & Dwarf9");
				else if(k3+k4+k1+k2+k7+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf5 & Dwarf6");
				else if(k3+k4+k1+k6+k2+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf5 & Dwarf7");
				else if(k3+k4+k1+k6+k7+k2+k9==100)
				System.out.print("Fake Dwarf is Dwarf5 & Dwarf8");
				else if(k3+k4+k1+k6+k7+k8+k2==100)
				System.out.print("Fake Dwarf is Dwarf5 & Dwarf9");
				else if(k3+k4+k5+k1+k2+k8+k9==100)
				System.out.print("Fake Dwarf is Dwarf6 & Dwarf7");
				else if(k3+k4+k5+k1+k7+k2+k9==100)
				System.out.print("Fake Dwarf is Dwarf6 & Dwarf8");
				else if(k3+k4+k5+k1+k7+k8+k2==100)
				System.out.print("Fake Dwarf is Dwarf6 & Dwarf9");
				else if(k3+k4+k5+k6+k1+k2+k9==100)
				System.out.print("Fake Dwarf is Dwarf7 & Dwarf8");
				else if(k3+k4+k5+k6+k1+k8+k2==100)
				System.out.print("Fake Dwarf is Dwarf7 & Dwarf9");
				else if(k3+k4+k5+k6+k7+k1+k2==100)
				System.out.print("Fake Dwarf is Dwarf8 & Dwarf9");
	}
}
