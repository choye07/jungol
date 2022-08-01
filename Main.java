import java.util.Scanner;

class t {
	int x1, x2, x3;
	int y1, y2, y3;

	public t(double x1, double x2, double x3, double y1, double y2, double y3) {
		x1 = this.x1;
		x2 = this.x2;
		x3 = this.x3;

		y1 = this.y1;
		y2 = this.y2;
		y3 = this.y3;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3;

		x1 = s.nextDouble();
		y1 = s.nextDouble();
		x2 = s.nextDouble();
		y2 = s.nextDouble();
		x3 = s.nextDouble();
		y3 = s.nextDouble();

		System.out.println("(" + Math.round(((x1 + x2 + x3) / 3) * 10.0) / 10.0 + ", "
				+ Math.round(((y1 + y2 + y3) / 3) * 10.0) / 10.0 + ")");
	}
}
