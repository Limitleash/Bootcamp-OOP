import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller{
	Scanner scan = new Scanner(System.in);
    String temp_string = new String();
    int temp_int;
    
    public void start(ArrayList<Participant> list){
        for(;;){
            System.out.print("Input a number [0..100]: ");
            try{
                temp_int = scan.nextInt();
                scan.nextLine();
                if(temp_int >= 0 && temp_int <= 100){
                    break;
                }
            }
            catch(InputMismatchException ime){
            	scan.nextLine();
                System.out.println("Input must be numeric");
            }
        }
        for(;;) {
        	System.out.println("Username [5..20 Characters]: ");
        	temp_string = scan.nextLine();
        	if(temp_string.length() >= 5 && temp_string.length() <= 20) {
        		char flag = '0';
        		for(Participant i : list) {
        			if(i.getName().contentEquals(temp_string)) {
        				System.out.println("Username has already been taken!");
        				flag = '1';
        				break;
        			}
        		}
        		if(flag == '0') {
        			break;
        		}
        	}
        }
        Participant new_participant = new Participant();
        new_participant.setName(temp_string);
        new_participant.setShare(temp_int);
        list.add(new_participant);
        System.out.println("You're the " + list.size() + " that joins the game!");
        System.out.printf("Your share number: %d\n", temp_int);
    }
    
    public void update(ArrayList<Participant> list) {
    	if(list.isEmpty() == true) {
    		System.out.println("There is no participant!");
    		return;
    	}
    	else {
			System.out.println("+==================================================+");
			System.out.println("+ Share List                                       +");
			System.out.println("+==================================================+");
			int i=0;
			for(Participant l : list) {
				l.print(i++);
			}
			System.out.println("+==================================================+");
			int len = list.size();
			for(;;) {
				try {
					System.out.printf("Participant to update[1..%d]: ", len);
					temp_int = scan.nextInt();
					scan.nextLine();
					if(temp_int >= 1 && temp_int <= len) {
						break;
					}
					else if(temp_int == 0) {
						return;
					}
				}
	            catch(InputMismatchException ime){
	            	scan.nextLine();
	                System.out.println("Input must be numeric");
	            }
			}
			
			int index;
			for(;;) {
				try {
					index = temp_int-1;
					System.out.print("Input a new share number [0..100]: ");
					temp_int = scan.nextInt();
					scan.nextLine();
					if(temp_int >= 0 && temp_int <= 100) {
						break;
					}
				}
				catch(InputMismatchException ime){
					scan.nextLine();
					System.out.println("Input must be numeric");
				}
			}
			list.get(index).setShare(temp_int);
    	}
    }
    
    public void delete(ArrayList<Participant> list) {
    	if(list.isEmpty() == true) {
    		System.out.println("There is no participant!");
    		return;
    	}
    	else {
			System.out.println("+==================================================+");
			System.out.println("+ Share List                                       +");
			System.out.println("+==================================================+");
			int i=0;
			for(Participant l : list) {
				l.print(i++);
			}
			System.out.println("+==================================================+");
			int len = list.size();
			for(;;) {
				try {
					System.out.printf("Participant to delete[1..%d][0 to exit]: ", len);
					temp_int = scan.nextInt();
					scan.nextLine();
					if(temp_int >= 1 && temp_int <= len) {
						break;
					}
					else if(temp_int == 0) {
						return;
					}
				}
	            catch(InputMismatchException ime){
	            	scan.nextLine();
	                System.out.println("Input must be numeric");
	            }
			}
			
			list.remove(temp_int-1);
    	}
    }

    
    public void exit(ArrayList<Participant> list) {
    	Collections.sort(list, new NameComparator<Participant>());
    	ArrayList<Participant> shuffled_list = new ArrayList<>();
    	int len = list.size();
    	shuffled_list = list;
    	Collections.shuffle(shuffled_list);
    	System.out.println("+==================================================+");
		System.out.println("+ Share List                                       +");
		System.out.println("+==================================================+");
		System.out.println("+ Username                       | Before | After  +");
		System.out.println("+==================================================+");
		for(int i = 0, j = len-1; i<len; i++, j--) {
		 System.out.printf("| %-30s | %-6d | %-6d |\n", list.get(i).getName(), list.get(i).getShare(), shuffled_list.get(j).getShare());
		}
		System.out.println("+==================================================+");
    }
}
