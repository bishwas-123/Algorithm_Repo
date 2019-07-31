package sortroutines;

import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        String str="we test coders";

        System.out.println("Result:"+reverseOrder(str));
    }
    public static String reverseOrder(String str){
        String[] strArr=str.split(" ");
        String result="";

        Stack<String> stack=new Stack();
        int i=strArr.length-1;
        while(i>=0){
            stack.push(reverse(strArr[i]));
            i--;
        }
        while(!stack.isEmpty()){
            result+=stack.pop()+" ";
        }
        return result;
    }
    public static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
