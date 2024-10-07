package oop;

public class Calculator4 {

    //
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void execute(){
        double result = avg(7,19);
        print("아래 print 메서드 " + result);
    }

    void print(String msg){
        System.out.println(msg);
    }

    //정사각형
    double areaRect(double width){
        return width * width;
    }

    //직사각형
    double areaRect(double width, double height){
        return width * height;
    }

}
