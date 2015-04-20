package stringOperations;
import java.util.Stack;


public class Test {

	
	public static int getCount(char a, String var){
		int cnt=0;
		for(int i=0; i<var.length(); i++){

			if(a==var.charAt(i)){
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		String a="I love     Yahoo";
		System.out.println(reverseWords(a));
		
}//end main
	 public static String reverseWords(String tempStr) {
	        StringBuilder sb = new StringBuilder();
	    
	        Stack<Character> reverse = new Stack<Character>();
	  

	        
	        for (int i=0; i< tempStr.length();i++){
	            char c = tempStr.charAt(i);
	          
	                
	                reverse.push(c);
	            
	        }
	        Stack<Character> t = new Stack<Character>();
	        while (!reverse.empty()){
	            char temp =reverse.pop();
	       
	            if(temp!=' '){
	            	  t.push(temp);
	               
	            }else{
	               
	            	 while (!t.empty()){
		                    char c =t.pop();
		                   
		                    sb.append(c);
		                }
		              sb.append(' ');
	            }
	        }
	        
	        
	     while (!t.empty()){
	            char c =t.pop();
	            sb.append(c);
	        }
	        return sb.toString();
	    }	
}
// Input- "hey  Akshay"->"hey Akshay"