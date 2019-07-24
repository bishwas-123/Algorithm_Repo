package lab1;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
     public static void main(String args[]) {
   
         int[] arr= {1, 3, 9, 4, 8, 5};
        // System.out.println("Output: "+);
         
     }
     
 	 public static List<List<Integer>> subsetcall(int index,int[] arr) {
		    List<List<Integer>> mainList = new ArrayList<>();
		    for (int i = index; i < arr.length; i++) {
		        List<Integer> subset = new ArrayList<>();
		        for (int j = index; j <= i; j++) {
		            subset.add(arr[j]);
		        }
		        mainList.add(subset);
		    }
		    return mainList;
		}
     
     public static List<Integer> subsetSum(int[] arr,int k){
    	    List<Integer> result=new ArrayList<>();
    	    List<List<Integer>> mainList=new ArrayList<>();
    	    for(int i=0; i<arr.length;i++){
    	        List<List<Integer>> newList=new ArrayList<>();
    	        newList=subsetcall(i,arr);
    	        mainList.addAll(newList);
    	    }
    	    System.out.println(mainList.toString());

    	    for(List<Integer> items:mainList){
    	        int sum=0;
    	        for(int item:items){
    	            sum=sum+item;
    	        }
    	        System.out.println(sum);
    	        if(sum==k){
    	            result=items;
    	            return result;
    	        }
    	        if(sum>k){
    	            return  null;
    	        }
    	    }
    	   return result;
    	}

}
