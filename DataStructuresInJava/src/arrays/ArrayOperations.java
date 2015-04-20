package arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayOperations {

	public static void main(String[] args) {
		int array[]={1,12,3,4,56,76,72,4,3,3,3,3,4};
		int secondLargest=findSecondLargest(array);
		System.out.println(secondLargest);
		findPairs(array, 7);
		
		
		
	}
	private static int findSecondLargest(int array[]){
		//Arrays.sort(array);
		//return(array[array.length-2]);
		int max=0;
		int secondmax=0;
		for(int num:array){
			if(num>max){
				secondmax=max;
				max=num;
			}
			else if(num>secondmax){
				secondmax=num;
			}
			
		}
		return secondmax;
	}
	
	private static void findPairs(int array[], int num){
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2=new HashMap<Integer, Integer>();
		for(int i=0; i<array.length; i++){
			if(map.containsKey(array[i])){
			//System.out.println(array[i]+","+ map.get(array[i]));
				map2.put(array[i], map.get(array[i]));
			}
			else{
				map.put(num-array[i],array[i]);
			}
		}
		System.out.println(map2);
		
	}
}
