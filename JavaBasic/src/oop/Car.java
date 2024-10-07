package oop;

public class Car {
    //
    int speed;

    //

    //
    int getSpeed(){
        return speed;
    }

    void keyTurnOn(){
        System.out.println("키를 돌려요");
    }

    void run(){
        for(int i = 10; i <= 50; i = i + 10){
            speed =i;
            System.out.println("달리는 속도 " + speed + " km/h");
        }
    }





}
