package divisor;

public class Divisors {
	public Divisors(int num_send) {
		int division_max = num_send -1;
		int division = 1;
		int divisible =0;
		String possible=num_send + " has divisors";
		while(division < division_max) {
			divisible= num_send%division;
			if(divisible==0) {
				possible = possible.concat(" " + division);
			}
			division++;
		}
		System.out.println(possible);
	}

}
