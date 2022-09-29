package packagetest;

public class CS380_Lab0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Lab CS 380");					// initialize title of exercise
		
		String string = "12345"; 						// initialize number sequence
		System.out.println("Given number: "+string);				// printing the original number
		
		String reverse = new StringBuffer(string).reverse().toString();		// ordering reversed sequence
		System.out.println("The reverse of given number: " +reverse);  		// printing reversed number sequence
		}
	}
