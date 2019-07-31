package sortroutines;

import java.util.ArrayList;
import java.util.List;

public class RecursiveReverse {
  private static List<Integer> revlist=new ArrayList<>();
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("hello"+ reverseList(list));
    }


    public static List<Integer> test(List<Integer> list){
        if(list.isEmpty()){
            return list;
        }
        return  reverse(list,new ArrayList<Integer>());
    }

    public static List<Integer> reverse(List<Integer> list,List result){

        result.add(list.get(list.size()-1));
//        if(list.size()==1){
//            return revlist;
//        }
        list.remove(list.size()-1);
        return reverse(list,result);
    }

    public static List reverseList(List<Integer> list){
        if(list.isEmpty()){
            return list;
        }
        return swap(list,0,list.size()-1);

    }
    public static List swap(List<Integer> list,int firstIndex,int lastIndex){
        int temp=0;
        if(firstIndex>lastIndex){
            return list;
        }
        temp=list.get(lastIndex);
        list.set(lastIndex, list.get(firstIndex));
        list.set(firstIndex,temp);
        return swap(list,firstIndex+1,lastIndex-1);


    }
}
