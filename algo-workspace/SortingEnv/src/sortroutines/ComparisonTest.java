package sortroutines;


import java.util.Arrays;

public class ComparisonTest {
    public static void main(String[] args) {
        int[] arr={1, 2, 17, -4, -6, 8};

        System.out.println("Result"+ Arrays.toString(comparison(arr)));
    }
    public  static int[] comparison(int[] arr){
        MergeSort merge =new MergeSort();
        int[] newArr=new int[arr.length];
        merge.sort(arr);
        int j=0;
        int len=arr.length;
        for(int i=0;i<arr.length/2;i++){
            newArr[j]=arr[i];
            newArr[j+1]=arr[len-i-1];
            j+=2;
        }
        return newArr;
    }

}
