package quiz02;

public class Quiz02_account {

	public static void main(String[] args) {

		Account acc = new Account("사과", "1234", 3600);

		acc.deposit(1000);
		acc.withdraw(3000);

		int bal = acc.getbalance();
		System.out.println(acc.name + "님의 잔액은: " + bal + "원입니다.");

		
		
	}

}
