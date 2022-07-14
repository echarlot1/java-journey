public class TwoSumNumber {
    int [] arrays;
    int target;

    TwoSumNumber(int[]  arrays){
        this.arrays = arrays;
//        this.target = target;
    }

    TwoSumNumber(int target){
        this.target = target;
    }




    void setTarget(int target) {
        this.target = target;
    }

    void setArrays(int[] arrays){
        this.arrays = arrays;
    }

    public int getTarget() {
        return this.target;
    }

    public int[] getArrays() {
        return this.arrays;
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
