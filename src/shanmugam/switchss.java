package shanmugam;

import java.util.Scanner;

public class switchss {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		switch (num) {
		case 10:
			System.out.println("number 10 is available");
			
			//break;
		case 20:
			System.out.println("number 20 is available");
			
			//break;
		case 30:
			System.out.println("number 30 is available");
			
		break;


		default:
			System.out.println("invalid");
			break;
		}

	}

}
