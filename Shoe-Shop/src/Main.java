import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public Main(){
		int ans;
		Scanner scan = new Scanner(System.in);
		ArrayList<ShoeFunctions> ShoeList = new ArrayList<>();
		ShoeController control = new ShoeController();
		ShoeFunctions p1 = new ShoeFunctions("VJ", "Running", "15-05-2021", 15000);
		ShoeFunctions p2 = new ShoeFunctions("Vincent Jo", "Boot", "05-05-2021", 15000);
		ShoeFunctions p3 = new ShoeFunctions("VJ 3", "Running", "05-12-2021", 15000);
		ShoeFunctions p4 = new ShoeFunctions("VJ 4", "Boot", "03-03-2000", 15000);
		ShoeFunctions p5 = new ShoeFunctions("VJ 5", "Running", "11-11-2021", 15000);
		ShoeList.add(p1);
		ShoeList.add(p2);
		ShoeList.add(p3);
		ShoeList.add(p4);
		ShoeList.add(p5);
		
		for(;;) {
			for(;;) {
				System.out.println("Shoe Shop");
				System.out.println("============");
				System.out.println("1. View Shoes");
				System.out.println("2. Add Shoes");
				System.out.println("3. Delete Shoes");
				System.out.println("4. Exit");
				System.out.print(">> ");
				ans = scan.nextInt();
				scan.nextLine();
				if(ans >= 1 && ans <= 4) {
					break;
				}
				else {
					System.out.println("Choices option didn't exist!\n");
				}					
			}
			
			if(ans == 1) {
				control.view(ShoeList);
			}
			else if(ans == 2) {
				control.add(ShoeList);
			}
			else if(ans == 3) {
				control.delete(ShoeList);
			}
			else if(ans == 4) {
				System.out.print("Thank you for using our program ^-^");
				break;
			}
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
