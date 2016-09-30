package m00;

import java.util.Arrays;

public class Search {
	
	/**
	 * Find the first occurrences of x in sorted array a.
	 * @param x value to find
	 * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
	 * @return lowest i such that a[i]==x, or -1 if x not found in a.
	 */
	public static int find(int x, int[] a) {
		return binarySearch(x, a,0,a.length-1);
		//return 0;
	} 
	

	public static int binarySearch(int x, int[] a, int first, int last) {		
		int mid = (first + last) / 2;
		 if (first == last){
				return -1;
			}
		 else if (x < a[mid]) {
			return binarySearch(x, a, first, mid /*not a but left half of a */);
		} else if (x > a[mid]) {
			return binarySearch(x, a, mid+1, last /*not a but right half of a */);
		} else{
			return mid; // because x == a[mid], i.e. we found it!
		}
	}
}
