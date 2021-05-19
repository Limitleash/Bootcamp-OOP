
public class Participant {

	private String name;
    private int share;
    
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setShare(int share){
		this.share = share;
	}
	public int getShare() {
		return share;
	}
	
	public void print(int num) {
		System.out.printf("| %-3d| %-35s| %-7d+\n", num+1, name, share);		
	}
}
