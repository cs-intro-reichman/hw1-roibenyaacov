// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double rate1 = rate/100 + 1;
		double futureValue = currentValue * Math.pow (rate1 ,2);
		System.out.println(" After " + n + " years, a $" + (int) currentValue + " saved at " + rate + "% will yield $" + (int) futureValue );
	}
}