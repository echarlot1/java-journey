import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the target number: ");
        int target = sc.nextInt();

        System.out.println(" list: ");
        int[] arrays = new int[size];

        for (int i=0; i<size; i++){
            int userInput = sc.nextInt();
            arrays[i] = userInput;
        }


        System.out.println(Arrays.toString(twoNumber(arrays, target)));







    }

    public static int[] twoNumber(int[] array, int target) {
        // Write your code here.
        for(int i=0; i<array.length-1; i++){
            int firstNum =array[i];

            for(int j=i+1; j<array.length; j++){
                int secNum=array[j];
                if(firstNum+secNum==target){
                    return new int[]{firstNum,secNum};
                }
            }
        }
        return new int[0];
    }


}


