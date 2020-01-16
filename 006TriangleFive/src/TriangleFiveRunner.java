import java.util.Scanner;

public class TriangleFiveRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String number;
		String letter;
		System.out.println("Enter letter");   
		letter = myObj.nextLine();
		System.out.println("Enter number"); 
		number = myObj.nextLine();  
		int num_send = Integer.parseInt(number);
		letter = letter.toUpperCase();
		TriangleFive send = new TriangleFive(num_send,letter);
	}

}
