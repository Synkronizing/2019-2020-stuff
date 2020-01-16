import java.util.Scanner;

public class FactorialRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String number;
		    
		System.out.println("Enter number"); 
		number = myObj.nextLine();  
		int num_send = Integer.parseInt(number);
		Factorial send = new Factorial(num_send);
	}

}
