import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ShoeValidation {
	public char valid_name(String name){
		if(name.endsWith("shoe")) {
			return '1';
		}
		else {
			return '0';
		}
	}
	
	public char valid_category(String name){
		if(name.contentEquals("Sneaker") || name.contentEquals("Running") || name.contentEquals("Boot")) {
			return '1';
		}
		else {
			return '0';
		}
	}
	
	public char valid_date(String name){
		try {
			SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
			date.setLenient(false);
			date.parse(name);
			return '1';
		}
		catch (ParseException pe){
			return '0';
		}
	}
	
	public char valid_price(Integer price){
		if(price >= 5000) {
			return '1';
		}
		else {
			return '0';
		}
	}
}
