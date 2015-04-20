package searching;

import java.util.Arrays;

public class RecurssiveBinarySearch {
	private static int arr1 []= {25,23,21,232,-2,567,76,90,976,99};
	public static void main(String[] args) {
		Arrays.sort(arr1);
		int key=232;
		int index=recursiveBinarySearch(0,arr1.length-1, key);
		if(index>-1)
		System.out.println("number:"+key+"is present");
		else
			System.out.println("not present");
		  
	}
	private static int recursiveBinarySearch(int i, int j, int key) {
		if(i<j){
			
			int mid=i+(j-i)/2;
			if(key<arr1[mid]){
				return recursiveBinarySearch(i,mid,key);
			}
			else if(key>arr1[mid]){
			return	recursiveBinarySearch(mid+1, j, key);
			}
			else{
				return mid;
			}
		}
		return -1;
	}

}
