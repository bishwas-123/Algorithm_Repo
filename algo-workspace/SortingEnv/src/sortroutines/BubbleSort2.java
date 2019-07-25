package sortroutines;

import java.util.Arrays;

import runtime.Sorter;

public class BubbleSort2 extends Sorter{
	 int[] arr;
	// private static int swap=0;
		@Override
		public int[] sort(int[] arr) {
			this.arr=arr;
			bubbleSort();
			return arr;
		}
		
		private void bubbleSort() {
			for(int i=0;i<arr.length;i++) {
				int swap=0;
				
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap++;
					swap(j,j+1);	
				}
				
			}
			if(swap==0) {
				break;
			}
			
				
				
			}
		}
		private int[] swap(int i,int j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			return arr;
		}
		
		public static void main(String[] args){
			int[] test = {21,13,1,-22, 51, 5, 18};
			BubbleSort2 bs = new BubbleSort2();
			
			System.out.println(Arrays.toString(bs.sort(test)));
			
		}

}
