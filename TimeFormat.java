// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String time = args[0]; 
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
		if ( hours > 12 && minutes < 10) {
			hours = hours - 12 ;
			System.out.println(  + hours + ":" + "0" + minutes + " PM");
		 }
		else if ( hours > 12 && minutes >= 10) {
			hours = hours - 12 ;
			System.out.println(  + hours + ":" + minutes + " PM");
		 } 
	
		else if ( hours < 12 && minutes < 10) {
			System.out.println( hours + ":" + "0" + minutes + " AM");
		}
		else 
			System.out.println( hours + ":" + "0" + minutes + " AM");
	}
}