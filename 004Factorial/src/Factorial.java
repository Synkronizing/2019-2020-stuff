
public class Factorial {

	public Factorial(int num_send) {
		// TODO Auto-generated constructor stub
		float fact=1;
		for(float a=num_send;a>0;a--) {
			fact=fact*a;
		}
		System.out.print(fact);
	}

}
