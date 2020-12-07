import java.util.Random;
import java.util.Scanner;

public class CalcPi {
	private Double num_points_circle;
	private Double num_points_total;

	public void CalcPi(int n) {
		this.num_points_circle = 0.0;
		this.num_points_total = 0.0;
		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			// Assigning a random poin on the grid between 0 - 1
			Double x = rand.nextDouble();
			Double y = rand.nextDouble();

			// Determine if the point is within the circle, if its less then one it sits
			// within the circle
			Double distance = (Math.pow(x, 2)) + (Math.pow(y, 2));

			if (distance <= 1) {
				this.num_points_circle += 1;
			}
			this.num_points_total += 1;
		}

		Double pi = 4 * this.num_points_circle / this.num_points_total;
		System.out.println(pi);
	}

	public static void main(String[] args) {

		CalcPi objName;
		objName = new CalcPi();

		Scanner input = new Scanner(System.in);  
		System.out.println("Number of points:");
		
		String n = input.nextLine(); 
		objName.CalcPi(Integer.parseInt(n));

	}

}
