import java.util.Scanner;

public class Caladd {
	public static void main(String args[]) {
		float a,b,res;
		char choice,ch;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("\n1. ADD two numbers \n");
			System.out.print("\n2. MUL two numbers \n");
			System.out.print("3. Exit \n");
			System.out.print("Enter your choice : \n");	
			choice = scan.next().charAt(0);

			switch(choice){
			case '1': System.out.println("Enter two numbers:");
			a = scan.nextFloat();
			b = scan.nextFloat();
			res = a+b;
			System.out.println("Result = " + res);
			break;
			case '2':System.out.println("Enter two numbers");
			a = scan.nextFloat();
			b = scan.nextFloat();
			res = a*b;
			System.out.println("Result = " + res);
			case '3':System.exit(0);
			break;
			
			default : System.out.println("Wrong choice");
			break;

			}
		
		System.out.println("_______________________________________________________");

		}while(choice!=3);


	}
}
