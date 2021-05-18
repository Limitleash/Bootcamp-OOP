import java.util.concurrent.ThreadLocalRandom;

public class ShoeFunctions {
	private String ShoeName;
	private String ShoeID = "SH";
	private String Category;
	private String Date;
	private Integer Price;
	
	//Constructor
	public ShoeFunctions(String ShoeName, String Category, String Date, Integer Price) {
		this.ShoeName = ShoeName;
		this.ShoeID = generateID();
		this.Category = Category;
		this.Date = Date;
		this.Price = Price;
	}
	
	public ShoeFunctions() {
		
	}

	
	
	public String ShoeView(int num) {
		String view = "";
		view += num + " " + this.ShoeName + "-" + this.ShoeID + "\n";
		view += "=====================\n";
		view += "Category: " + this.Category + "\n";
		view += "Release date: " + this.Date + "\n";
		view += "Price: " + this.Price + "\n";
		return view;
	}
	
	private String generateID() {
		Integer random = ThreadLocalRandom.current().nextInt(0, 1000);
//		System.out.println("Random: " + random); //Debug
		return (this.ShoeID + random);
	}


	public void setShoeName(String shoeName) {
		ShoeName = shoeName;
	}

	public void setShoeID() {
		ShoeID = generateID();
//		System.out.println(ShoeID);
	}

	public void setCategory(String category) {
		Category = category;
	}

	public void setDate(String date) {
		Date = date;
	}

	public void setPrice(Integer price) {
		Price = price;
	}
	
	
	
}
