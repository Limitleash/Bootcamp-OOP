
public class Functions {
	private int num1;
	private int num2;
	private boolean state1;
	private boolean state2;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public Boolean getState1() {
		return state1;
	}
	public void setState1(Boolean state) {
		this.state1 = state;
	}
	public Boolean getState2() {
		return state2;
	}
	public void setState2(Boolean state) {
		this.state2 = state;
	}
	
	public String stringType() {
		String a = String.valueOf(this.num1);
		String b = String.valueOf(this.num2);
		return (a + " + " + b);
	}
	
	public String characterType() {
		char a = (char) this.num1;
		char b = (char) this.num2;
		return (a + " " + b);
	}
	
	public int integerType(char operator) {
		if(operator == '+') {
			return (this.num1 + this.num2);
		}
		else if(operator == '-') {
			return (this.num1 - this.num2);
		}
		else if(operator == '*') {
			return (this.num1 * this.num2);
		}
		else if(operator == '/') {
			return (this.num1 / this.num2);
		}
		else if(operator == '%') {
			return (this.num1 % this.num2);
		}
		else { //wrong operator
			return -1;
		}
	}

	public float floatingType() {
		float a = (float) this.num1;
		float b = (float) this.num2;
		return (a/b);
	}

	public boolean booleanType() {
		return (this.num1 == this.num2);
	}
	
	public void table_status() {
		char p1, p2;
		if(this.state1 == true) {
			p1 = 'T';
		}
		else if(this.state1 == false) {
			p1 = 'F';
		}
		else {
			p1 = 'E'; //E for error
		}
		if(this.state2 == true) {
			p2 = 'T';
		}
		else if(this.state2 == false) {
			p2 = 'F';
		}
		else {
			p2 = 'E';
		}
		System.out.printf("+ P1 = %c , P2 = %c                                          +\n", p1, p2);
	}
	
	public boolean tableInverse1() {
		if(this.state1 == true) {
			return false;
		}
		else if(this.state1 == false) {
			return true;
		}
		return false; //error
	}
	public boolean tableInverse2() {
		if(this.state2 == true) {
			return false;
		}
		else if(this.state2 == false) {
			return true;
		}
		return false; //error
	}
	public boolean tableAnd() {
		if(this.state1 == true && this.state2 == true) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean tableOr() {
		if(this.state1 == true || this.state2 == true) {
			return true;
		}
		else {
			return false;
		}
	}
}
