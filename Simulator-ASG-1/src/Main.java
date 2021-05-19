import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	int choice;
	int temp_num1;
	int temp_num2;
	String temp_string;
	boolean bool;
	Controller control = new Controller();
	
	public Main() {
		for(;;) {
			System.out.println("BJ - JPTable");
			System.out.println("=========================");
			System.out.println("1. Start the simulation");
			System.out.println("2. Close App");
			for(;;) {
				try {
					System.out.print(">> ");
					choice = scan.nextInt();
					scan.nextLine();
					if(choice >= 1 && choice <= 2) {
						break;
					}
				}
				catch(InputMismatchException ime){
					scan.nextLine();
					System.out.println("Input must be numeric");
				}
			}
			if(choice == 1) {
				for(;;) {
					try {
						System.out.println("Input the first number [1-100] (inclusive): ");
						temp_num1 = scan.nextInt();
						scan.nextLine();
						if(temp_num1 >= 1 && temp_num1 <= 100) {
							break;
						}
					}
					catch(InputMismatchException ime){
						scan.nextLine();
						System.out.println("Input must be numeric");
					}
				}
				for(;;) {
					try {
						System.out.println("Input the second number [1-100] (inclusive): ");
						temp_num2 = scan.nextInt();
						scan.nextLine();
						if(temp_num2 >= 1 && temp_num2 <= 100) {
							break;
						}
					}
					catch(InputMismatchException ime){
						scan.nextLine();
						System.out.println("Input must be numeric");
					}
				}
				control.simulator1(temp_num1, temp_num2);
				control.simulator2();
				
				for(;;) {
					try {
						System.out.println("Give me a value for p1 [true | false]: ");
						bool = scan.nextBoolean();
						scan.nextLine();
						if(bool == true || bool == false) {
							break;
						}
					}
					catch(InputMismatchException ime){
						scan.nextLine();
					}
				}
				control.calculate.setState1(bool);
				for(;;) {
					try {
						System.out.println("Give me a value for p2 [true | false]: ");
						bool = scan.nextBoolean();
						scan.nextLine();
						if(bool == true || bool == false) {
							break;
						}	
					}
					catch(InputMismatchException ime){
						scan.nextLine();
					}
				}
				control.calculate.setState2(bool);
				control.simulator3();
			}
			else if(choice == 2) {
				System.out.println("Thank you for using the apps!");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
