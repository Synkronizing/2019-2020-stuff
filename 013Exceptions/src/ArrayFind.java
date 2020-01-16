import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayFind {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String food[] = {"Spaghetti","Ham and cheese Sandwich","Orange Chicken","Steak","Lemon Meringue Pie","Chocolate Cake"};
		boolean numberfind=false;
		Scanner find= new Scanner(System.in);
		
		System.out.println("Pick a number between 0-5: ");
		while(numberfind==false) {
			try {
				int foodnum=find.nextInt();
				System.out.println(food[foodnum]);
				numberfind=true;
			}catch(InputMismatchException e) {
				find.next();
				System.out.println(e);
				System.out.println("Please enter an Integer");
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("Enter Integer between 0-5");
			}catch(Exception e) {
				System.out.println(e);
				System.out.println("UUUHH Don't do that");
			}
		
		
		}
	}

}
