package lab1;

import java.util.Arrays;

public class MergeSort {
	
	 public static int fibonacciLoop(int nthNumber) {
	        //use loop
	        int previouspreviousNumber, previousNumber = 0, currentNumber = 1;

	        for (int i = 1; i < nthNumber ; i++) {

	            previouspreviousNumber = previousNumber;

	            previousNumber = currentNumber;

	            currentNumber = previouspreviousNumber + previousNumber;

	        }
	        return currentNumber;
	    }
	public static void main(String args[]) {
//		int[] m1= {1, 4, 5, 8, 17};
//		int[] m2= {2, 4, 8, 11, 13, 21, 23, 25};
//		  System.out.println("Output"+Arrays.toString(mergeSort(m1, m2)) );
		
		System.out.println("Output+"+ fibonacciLoop(4));
	}
	public static int[] mergeSort(int[] m1, int[] m2) {
		int[] p=new int[m1.length+m2.length];
	int i=0,j=0,k=0;

	
	while(i<m1.length && j<m2.length) {
		if(m1[i]<m2[j] ) {
			  p[k]=m1[i];
			  i++;
			}
		else {
			p[k]=m2[j];
			j++;
		}
		k++;
		}
		System.arraycopy(m1, i, p, k, m1.length-i);
		System.arraycopy(m2,j, p, k, m2.length-j);
	
	
	return p;
	}
		
	

}
