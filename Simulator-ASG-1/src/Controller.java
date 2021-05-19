import java.util.Scanner;

public class Controller {
	Functions calculate = new Functions();
	Scanner scan = new Scanner(System.in);
	
	public void simulator1(int num1, int num2) {
		calculate.setNum1(num1);
		calculate.setNum2(num2);
		System.out.println("+=========================================================================================================================================================================================+");
		System.out.println("+    + (String type)         |         (Character Type)         |         * (Integer Type)         |         / (Floating Type)         |          input1 == input2 (Boolean Type)         +");
		System.out.println("+=========================================================================================================================================================================================+");
		System.out.println("+    " + calculate.stringType() + "         |         " + calculate.characterType() + "         |         " + calculate.integerType('*') + "         |         " + calculate.floatingType() + "         |         " + calculate.booleanType() + "       +");
		System.out.println("+=========================================================================================================================================================================================+");
		System.out.print("Press Enter to Proceed...");
		scan.nextLine();
	}
	
	public void simulator2() {
		System.out.println("+===================================================================================================+");
		System.out.println("+         +         |         -         |         *         |         /         |         %         +");
		System.out.println("+===================================================================================================+");
		System.out.println("+         " + calculate.integerType('+') + "         |         " + calculate.integerType('-') + "         |         " + calculate.integerType('*') + "         |         " + calculate.integerType('/') + "         |         " + calculate.integerType('%') + "       +");
		System.out.println("+===================================================================================================+");
		System.out.print("Press Enter to Proceed...");
		scan.nextLine();
	}
	
	public void simulator3() {
		System.out.println("+=====================================================================================+");
		System.out.println("+Logical Table                                                                        +");
		System.out.println("+=====================================================================================+");
		System.out.printf("+         !P1         |         !P2         |         &&         |         ||         +\n");
		System.out.println("+=====================================================================================+");
		System.out.println("+        " + calculate.tableInverse1() + "        |       " + calculate.tableInverse2() + "        |        " + calculate.tableAnd() + "       |       " + calculate.tableOr() + "        +");
		System.out.println("+=====================================================================================+");
		System.out.print("Press Enter to Proceed...");
		scan.nextLine();
	}
}
