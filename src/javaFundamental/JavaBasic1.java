package javaFundamental;

public class JavaBasic1 {
    private static int result;
    String name;
    int age;


    JavaBasic1(){

    }

    JavaBasic1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static int sum(int minNumber, int maxNumber){
        result =0;
        for(int i =minNumber; i<= maxNumber; i +=1){
            result +=i;
        }
        return result;
    }
}
