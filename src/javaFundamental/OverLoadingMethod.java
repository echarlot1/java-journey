package javaFundamental;
//overloading method: methods with same name but different parameters

public class OverLoadingMethod {
    int NumberOfWheels;
    String name;
    String model;

    OverLoadingMethod(){

    }
    OverLoadingMethod(String name, int numberOfWheels, String model){
        this.model = model;
        this.name = name;
        this.NumberOfWheels = numberOfWheels;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.NumberOfWheels = numberOfWheels;
    }

    public String carDesc(String name, int numberOfWheels){
        String desc = "The Car is a "+ name + " it has "+ numberOfWheels;
        return desc;
    }
    public  int carDesc(int numberOfWheels){
        return numberOfWheels;
    }

}
