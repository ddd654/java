package fruit;

public class StudentEx {
    public static void main(String[] args) {
        //객체
        Fruit myFruit = new Fruit();

        //필드 값
        System.out.println("종류 " + myFruit.fruit);
        System.out.println("이름 " + myFruit.apple);
        System.out.println("색깔 " + myFruit.color);
        System.out.println("크기 " + myFruit.tall);
        System.out.println("무게 " + myFruit.weight);

        //필드 값 변결
        myFruit.weight = 100;

        System.out.println(myFruit.weight + "kg");
    }
}



