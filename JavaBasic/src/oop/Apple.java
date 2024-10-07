package oop;

public class Apple {
    int apple = 333;
    int size;


    Apple(){

    }

    void Apple(){
        int apple = 22;
        System.out.println(apple);
        System.out.println(this.apple);
    }
}

class App{
    public static void main(String[] args) {
        Apple apple123 = new Apple();



    }
}
