package stringOperations;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringOps2 {

	public static void main(String[] args) {
	
		String amazon="buy {product} at amazon";
		String input="aaaaaassssssxxx";
		replaceProduct(amazon, input);
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		for(int i=0; i<input.length(); i++){
			map.put(input.charAt(i), findCount(input,input.charAt(i)));
		}
		
		int maxCount=Collections.max(map.values());
		for(Entry<Character, Integer> entry: map.entrySet()){
			if(entry.getValue()==maxCount)
				System.out.println("Maximum Occuring Character is:"+entry.getKey());
		}
		
	}

private static int findCount(String input, char c){
	int cnt=0;
	for(int i=0;i <input.length(); i++){
		
		if(c==input.charAt(i))
			cnt++;
	}
	return cnt;
}
	private static void replaceProduct(String amazon, String input){
		StringBuffer buffer=new StringBuffer();
		for(int i=0; i<amazon.length(); i++){
	 char temp=amazon.charAt(i);
	 if(temp!='{'){
		 buffer.append(temp);
		 }
	 else if(temp=='{') {
		 buffer.append(temp);
		 buffer.append(input);
		 int index=i;
		 while(amazon.charAt(index)!='}')
		 {
			 index++;
		 }
		 i=index-1;
	 }
	}//end for
		System.out.println(buffer.toString());
}
}
