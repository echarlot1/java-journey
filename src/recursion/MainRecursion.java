package recursion;

import java.util.Scanner;

public class MainRecursion {
    public static void main(String[] args){

        //    sum of the integers using recursion


//        Fibonacci using recursion
        MainRecursion k = new MainRecursion();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();


//        f(n) = f(n-1) + f(n-2)
//        0, 1, 1, 2, 3, 5, 8, 13
//        lets say n =3, meaning is the next number.
//        f(3) = f(3-1) + f(3-2)
        var rec0 = k.fibonacci(k.fibonacci(n));
        System.out.println("The fibonacci of "+ n + " is "+ rec0);



//Factorial using recursion
        MainRecursion m = new MainRecursion();
//        n! = n *(n-1)*(n-2)*2*1
//        (n-1)! =(n-1)*(n-1-2)*2*1
        var rec = m.factorial(n);
        System.out.println( "The factorial number of "+ n + " is "+ rec);
        System.out.println(m.factorial(n));

    }

    public int factorial(int n){
        if(n<1){
            return -1;
        }
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

//    Fibonacci method
    public int fibonacci(int n){
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

//    sum of the integers using recursion


}
