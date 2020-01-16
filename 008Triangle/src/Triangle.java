
public class Triangle {

	public Triangle(int numA, int numB, int numC) {
		// TODO Auto-generated constructor stub
		float perim = numA+numB+numC;
		float s = perim/2;
		float temp=s*((s-numA) *(s-numB)*(s-numC));
		double area = Math.sqrt(temp);
		System.out.println(area);
	}

}
