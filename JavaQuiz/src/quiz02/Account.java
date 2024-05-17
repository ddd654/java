package quiz02;

public class Account {

	String name;
	String password;
	int balance;

	Account(String pName, String pPassword, int pBalance) {
		name = pName;
		password = pPassword;
		balance = pBalance;
	}

	//입금
	void deposit(int a) {
		balance += a;
	}

	//출금
	void withdraw(int a) {
		balance -= a;
	}

	//잔액조회
	int getbalance() {
//		int bal = balance;
		return balance; //클래스 외부에서 값을 가져갈 수 있음
	}

	//생성자 만들면, 만들것
	Account() {

	}

}
