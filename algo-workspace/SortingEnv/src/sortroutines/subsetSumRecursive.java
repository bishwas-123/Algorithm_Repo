package sortroutines;

/*
hasMembersThatSumTo(list, total):
    if total == 0
        return true
    else if total < 0 or list is empty
        return false
    else
        int first = list.pop
        return hasMembersThatSumTo(list, total - first)
            or hasMembersThatSumTo(list, total)
 */


import java.util.ArrayList;
import java.util.List;

public class subsetSumRecursive {
    static boolean isSubsetSum(int set[],
                               int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;

        // If last element is greater than
        // sum, then ignore it
        if (set[n-1] > sum)
            return isSubsetSum(set, n-1, sum);

        /* else, check if sum can be obtained
        by any of the following
            (a) including the last element
            (b) excluding the last element */
        return isSubsetSum(set, n-1, sum) ||
                isSubsetSum(set, n-1, sum-set[n-1]);
    }

    public static void main(String[] args) {

        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 2222;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");










        List<Integer> list=new ArrayList<>();
list.add(1);
list.add(6);
list.add(8);
list.add(9);
list.add(11);
int [] arr={5,6,9,9,4};

    }

    public  static boolean checkSubsetSum(List<Integer> list,int sum)
    {
        if(sum==0){
            return true;
        }
        else if(sum<0 || list.isEmpty()){
            return false;
        }
        else{
            int firstElement=list.get(0);
            list.remove(firstElement);
            return checkSubsetSum(list,sum-firstElement) || checkSubsetSum(list,sum);
        }

//        else if total < 0 or list is empty
//        return false
//    else
//        int first = list.pop
//        return hasMembersThatSumTo(list, total - first)
//        or hasMembersThatSumTo(list, total)


   // return false;
    }
}
