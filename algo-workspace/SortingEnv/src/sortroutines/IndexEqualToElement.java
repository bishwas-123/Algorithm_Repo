package sortroutines;

public class IndexEqualToElement {


    public static void main(String[] args) {
        int[] arr={1,2,3,0,0,7,6,5};
        System.out.println("Result "+indexEqual(arr) );
    }

    public static boolean indexEqual(int[] arr){
        int i=0;
        while(i<arr.length){
            if(i==arr[i]){
                return true;
            }
            i++;
        }
        return false;
    }
}
