package quiz07.poly;

public class Main {
	public static void main(String[] args) {

		MyCart cart = new MyCart(10000);
		
		cart.buy(new Computer());
		cart.buy(new Radio());
		
		cart.info();
	}
	
}
