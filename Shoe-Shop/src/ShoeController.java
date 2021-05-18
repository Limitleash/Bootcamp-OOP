import java.util.ArrayList;
import java.util.Scanner;

public class ShoeController {
	Scanner scan = new Scanner(System.in);

	public void view(ArrayList<ShoeFunctions> ShoeList) {
		if(ShoeList.isEmpty() == true) { //No Shoe in ArrayList
			System.out.println("No shoes availabe..");
			System.out.println("Press enter to continue");
//			Scanner enter = new Scanner(System.in);
//			enter.nextLine();
//			enter.close();
			scan.nextLine();
		}
		else { //There 1 Shoe in minimum in ArrayList
			int size = ShoeList.size();
			for(int i=0; i<size; i++) {
				System.out.println(ShoeList.get(i).ShoeView(i+1));
			}
		}
	}
	
	public void add(ArrayList<ShoeFunctions> ShoeList) {
//		Scanner scan = new Scanner(System.in);
		ShoeFunctions temp = new ShoeFunctions();
		ShoeValidation validate = new ShoeValidation();
		String temp_string = new String();
		int temp_int;
		
		do {
			System.out.print("Input shoe\'s name[name ends with shoe, example: \"Fire shoe\"]: ");
			temp_string = scan.nextLine();
		}while(validate.valid_name(temp_string) == '0');
		temp.setShoeName(temp_string);

		do {
			System.out.print("Input shoe's category [Sneaker | Running | Boot] (case sensitive): ");
			temp_string = scan.nextLine();
		}while(validate.valid_category(temp_string) == '0');
		temp.setCategory(temp_string);

		do {
			System.out.print("Input shoe's release date [dd-mm-yyyy]: ");
			temp_string = scan.nextLine();
		}while(validate.valid_date(temp_string) == '0');
		temp.setDate(temp_string);

		do {
			System.out.print("Input shoe's price [more than or equals to 5000]: ");
			temp_int = scan.nextInt(); scan.nextLine();
		}while(validate.valid_price(temp_int) == '0');
		temp.setPrice(temp_int);
	
		temp.setShoeID();
		ShoeList.add(temp);
		System.out.println("Shoe Added!");
		System.out.println("Press enter to continue..."); scan.nextLine();
//		scan.close();
	}
	
	public void delete(ArrayList<ShoeFunctions> ShoeList) {
		view(ShoeList);
		if(ShoeList.isEmpty() == true) {
			return;
		}
		else {
//			Scanner scan = new Scanner(System.in);
			int index;
			for(;;) {
				System.out.printf("\nChoose shoe's number to delete [1..%d]: ", ShoeList.size());
				index = scan.nextInt(); scan.nextLine();
				if(index >= 1 && index <= ShoeList.size()) {
					break;
				}
			}
			ShoeList.remove(index-1);
			System.out.println("Shoe removed!");
//			scan.close();
		}
	}
}
