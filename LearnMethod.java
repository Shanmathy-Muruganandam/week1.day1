package week1.day1;

public class LearnMethod {
	
	public void printName() {
		System.out.println("Baalaajee");	
	}
	private int getCreditCardPin() {
		int pin = 2022;
		return pin;
	}
	void printGivenName(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		LearnMethod a = new LearnMethod();
		a.printName();
		a.printGivenName("Durai");
		int output  = a.getCreditCardPin();
		System.out.println(output);
	}

}
