package oop;

public class CalculatorDemo {
    public static void sum(int num1, int num2) {
        int hap = num1 + num2;
        System.out.println(hap);
    }

    public static void avg(int num1, int num2) {
        int average = num1 / num2;
        System.out.println(average);
    }

    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = 22;
        num2 = 44;
        sum(num1, num2);
        avg(num1, num2);

        num1 = 100;
        num2 = 33;
        avg(num1, num2);
    }
}

class Calculator2 {
    static double PI = 3.14;
    static int base = 0;

    int num1, num2;

    public void setOprands(int num1, int num2) {
        this.num1 = num1; //this는 변수를 가르킴
        this.num2 = num2;
    }

    public void sum() {
        System.out.println(this.num1 + this.num2);
    }

    public void avg() {
        System.out.println((this.num1 + this.num2) / 2);

    }
}

class Calculator3 {

    public static void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void avg(int num1, int num2) {
        System.out.println((num1 + num2) / 2);
    }
}

class CalulatorDemo4 {
    public static void main(String[] args) {
        Calculator3.sum(11, 22); //메모리 절약용 클래스 써서 메소드
    }
}

class ScopeDemo {
    static int i;

    static void a() {
        i = 0;
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }

}


class C {
    int v = 10;

    void m() {
        int v = 22;
        System.out.println("지역 변수인 m 메서드 쓰기 " + v);
        System.out.println("전역 변수의 m 메서드 쓰기 " + this.v);
    }
}

class Calculator1 {

}


class Calculator24 {
    int num1, num2;

    public Calculator24(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sum() {
        System.out.println(num1 + num2);
    }

    public void avg() {
        System.out.println((num1 + num2) / 2);
    }
}

class CalculatorDemo5 {
    public static void main(String[] args) {
        Calculator24 c1 = new Calculator24(11,22);
        CalculatorDemo5 demo5 = new CalculatorDemo5();
        c1.sum();
        c1.avg();


    }
}





