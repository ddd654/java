package module;

public class Calculator {

    //더하기
    int sumAll(int ... values){
        int total =0;
        for(int i = 0; i < values.length; i++){
            total += values[i];
        }
        return total;
    }

    //


}



