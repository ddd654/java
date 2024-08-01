package quiz04;

import java.util.Scanner;

public class MyAccount extends Account {

//	Scanner scan = new Scanner(System.in);
	
	MyAccount(String pName, String pw, int bal){
		name = pName;
		password = pw;
		balance = bal;
	}
	
	
	int balance = 100;

	void withdraw(int money) {
		Scanner scan = new Scanner(System.in);
		System.out.println("비밀번호>");
		String pw = scan.next();

		if(pw.equals(password)) {
			
			if(balance < money) {
				System.out.println("잔액부족");
				return;
			}
			balance -= money;
		} else {
			System.out.println("x");
		}

		
//		if (password == a) {
//			int money = scan.nextInt();
//
//			if (balance > money) {
//				balance -= money;
//				System.out.println("인출");
//			} else {
//				System.out.println("잔액부족");
//			}
//			
//		} else {
//			System.out.println("패스워드 다름");
//
//		}
		

	}

	void deposit(int money) {

		balance += money;
	}

}
