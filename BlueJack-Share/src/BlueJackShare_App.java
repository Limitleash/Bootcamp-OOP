import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BlueJackShare_App {

	public BlueJackShare_App() {
		Scanner scan = new Scanner(System.in);
        Controller control = new Controller();
        int choice;
        ArrayList<Participant> list = new ArrayList<>();
        for(;;){
            System.out.println("BJ-SHARE");
            System.out.println("+=========================+");
            System.out.println("+Options                  +");
            System.out.println("+=========================+");
            System.out.println("+1. Start Sharing         +");
            System.out.println("+2. Update Participant    +");
            System.out.println("+3. Delete Participant    +");
            System.out.println("+4. Close App             +");
            System.out.println("+=========================+");
            for(;;){
                try{
                    System.out.print("Choice >> ");
                    choice = scan.nextInt();
                    scan.nextLine();
                    if(choice >= 1 && choice <= 4){
                        break;
                    }
                }
                catch(InputMismatchException ime){
                	scan.nextLine();
                    System.out.println("Input must be numeric");
                }
            }
            if(choice == 1){
                control.start(list);
            }else if(choice == 2){
                control.update(list);
            }else if(choice == 3){
                control.delete(list);
            }
            else if(choice == 4){
                System.out.print("Thank you");
                break;
            }
        }
        scan.close();
	}
	public static void main(String[] args) {
		new BlueJackShare_App();
	}

}
