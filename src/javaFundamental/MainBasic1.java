package javaFundamental;

public class MainBasic1 {
    public static void main(String[] args){
        JavaBasic1 person1 = new JavaBasic1("David", 34);
        JavaBasic1 person2 = new JavaBasic1();
        JavaBasic1 sumNumbers = new JavaBasic1();



        System.out.println(person2.name = "Emmanuel");
        System.out.println("The sum of 0-3 is: "+ sumNumbers.sum(0, 3));


        System.out.println(person1.name + " is "+ person1.age);

        //        =================OverLoading Method =========================
        System.out.println("\n //        ============OverLoading Method =================");
        OverLoadingMethod car1 = new OverLoadingMethod();
        car1.setName("Nissan");
        car1.setNumberOfWheels(4);
        System.out.println(car1.carDesc("Honda", 2));
        System.out.println(car1.carDesc(4));
    }
}
