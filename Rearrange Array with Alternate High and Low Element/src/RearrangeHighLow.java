import java.util.Arrays;

public class RearrangeHighLow {

    public static void rearrangeArray(int [] rearrangeArr){

        int tempArr [] = new int[rearrangeArr.length];
        int start = 0;
        int end = tempArr.length-1;
        int k = 0;

        while (start < end){

            tempArr[k++] = rearrangeArr[start++];
            tempArr[k++] = rearrangeArr[end--];
        }

        if(rearrangeArr.length%2!=0){
            tempArr[k] = rearrangeArr[start];
        }

        System.out.println("Sorted: "+Arrays.toString(tempArr));

    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8};
        int [] arr1 = {1,2,3,4,5,6,7};
        rearrangeArray(arr);
        rearrangeArray(arr1);
    }

}
