// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limNum = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * limNum) + 1;
		int b = (int)(Math.random() * limNum) + 1;
		int c = (int)(Math.random() * limNum) + 1;
		int highNum = Math.max (Math.max(a, b), c);
		int lowNum = Math.min (Math.min(a, b), c);
		int midNum = ( a + b + c - highNum - lowNum ); 
		System.out.println( a + " " + b + " " + c );
		System.out.println( lowNum + " " + midNum + " " + highNum );
	}
}
