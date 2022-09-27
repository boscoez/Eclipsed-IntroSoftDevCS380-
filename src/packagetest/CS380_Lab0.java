package packagetest;

public class CS380_Lab0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Lab CS 380");				// initialize title of exercise
		
		int number = 12345, reverse = 0; 				// initialize number sequence
		System.out.println("Given number: "+ number);			// printing the original number
		
		while(number != 0){  						// while loop for all numbers not zero
		int remainder = number % 10;  					// initialize remainder 		
		reverse = reverse * 10 + remainder;  				// reversing the numerical sequence
		number = number/10;  						// ordering reversed sequence
		}
		System.out.println("The reverse of given number: " + reverse);  // printing reversed number sequence
		}
	}
