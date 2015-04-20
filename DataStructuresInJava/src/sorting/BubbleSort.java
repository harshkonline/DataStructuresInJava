package sorting;

public class BubbleSort {
	 public static int[] doBubbleSort(int[] arr){
         
	        for (int i = 0; i < arr.length - 1; i++){
	         for(int j=0; j<arr.length-i-1;j++){
	        	 //System.out.println(arr.length-i-1);
	        	 if(arr[j]>arr[j+1]){
	        		 int temp=arr[j];
	        		 arr[j]=arr[j+1];
	        		 arr[j+1]=temp;
	        	 }
	         }
	        	
	         
	      }
	               
	      return arr;
	   }
	     
	    public static void main(String a[]){
	         
	        int[] arr1 = {10,34,2,56,7,67,88,42};
	        int[] arr2 = doBubbleSort(arr1);
	        for(int i:arr2){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
	
}
