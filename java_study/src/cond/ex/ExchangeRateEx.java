package cond.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar = 10;
        if (dollar < 0) {
            System.out.println("잘못된 금액");
        } else if (dollar == 0) {
            System.out.println("환전할 금액 x");
        } else if (dollar > 0) {
            int won = dollar * 1400;
            System.out.println("환전 금액 : " + won);
        }

    }
}