//package sortroutines;
//import java.util.Arrays;
//
//import runtime.Sorter;
//
//public class ZerosAndOnes extends Sorter {
//	private int [] arr;
//	@Override
//	public int[] sort(int[] arr) {
//		this.arr=arr;
//		bubbleSort();
//		return arr;
//	}
//	
//	private void bubbleSort() {
//		for(int i=0;i<arr.length;i++) {
//			int swap=0;
//			
//		for(int j=0;j<arr.length-1;j++) {
//			if(arr[j]>arr[j+1]) {
//				swap++;
//				swap(j,j+1);	
//			}
//			
//		}
//		if(swap==0) {
//			break;
//		}
//		
//			
//			
//		}
//	}
//	
//	private int count(int[] arr) {
//		if(arr[0]==1) {
//			return 1;
//		}
//		while(arr[i]==0) {
//			zero++;
//			i++;
//		}		
//		while(arr[i]==1)
//	}
//	private int[] swap(int i,int j) {
//		int temp=arr[i];
//		arr[i]=arr[j];
//		arr[j]=temp;
//		return arr;
//	}
//	
//	public static void main(String[] args){
//		int[] test = {21,13,1,-22, 51, 5, 18};
//		BubbleSort1 bs = new BubbleSort1();
//		
//		System.out.println(Arrays.toString(bs.sort(test)));
//		
//	}
//
//}
//
//
//
//
//
