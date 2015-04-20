package stringOperations;

public class SwapWithoutTemp {
	public static void main(String[] args) {
		int a=123;
		int b=231;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}

}
