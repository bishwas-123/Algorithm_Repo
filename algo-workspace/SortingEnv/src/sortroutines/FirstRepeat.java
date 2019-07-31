package sortroutines;

import java.util.ArrayList;
import java.util.List;

public class FirstRepeat {
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 9, 3, 2, 1, 4, 5};
        System.out.println("Result: "+ firstRepeat(arr));
    }
    public static int firstRepeat(int[] ar){
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < ar.length ;i++)
            res = res ^ ar[i];

        return res;
//        List<Integer> list=new ArrayList<>();
//
//        for(int i=0;i<arr.length;i++){
//           if(!list.contains(arr[i])){
////               list.add(arr[i]);
//               System.out.println("add : "+arr[i]+list.add(arr[i]));
//           }
//
//           else{
//               System.out.println("Rem: "+ list.remove(arr[i]));
//             //  list.remove(arr[i]);
//           }
//
//        }

   // return list.get(0);
//        if (arr.length == 0) return 0;
//        int[] bucket=new int[3*arr.length-1];
//
//        for(int i=0;i<bucket.length;i++){
//            bucket[i]=0;
//        }
//
//      for(int i=0;i<arr.length;i++){
//          bucket[arr[i]]= bucket[arr[i]]+1;
//      }
//      for(int i=0;i<bucket.length;i++){
//          if(bucket[i]==1){
//              return bucket[i];
//          }
//      }
//
//        return 0;
    }
}
