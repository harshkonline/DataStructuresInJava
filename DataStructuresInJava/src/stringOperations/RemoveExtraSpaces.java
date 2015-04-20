package stringOperations;

public class RemoveExtraSpaces {
	public static void main(String[] args) {
		String a="hey      hi how              are you            ";
//		String ba=a.replaceAll("\\s+", " ");
//		System.out.println(ba);
		int index=0;
		boolean flag=false;
		StringBuffer buff=new StringBuffer();
		for(int i=0;i<a.length()-1; i++){
			index=i;
			char temp=a.charAt(index);
			if(temp!=' ')
			buff.append(temp);
			else if(a.charAt(i+1)!=' '){
				buff.append(a.charAt(i));
				}
			
    
	}//for
		
		System.out.println(buff.toString());
}
}
