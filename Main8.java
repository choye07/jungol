import java.util.Scanner;

public class Main8 {
	static final int LIMIT = 10;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] num = new int[LIMIT];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < LIMIT; i++)
			num[i] = s.nextInt();
		
		for (int i = 1; i < LIMIT; i += 2)
			sum += num[i];
		
		System.out.printf("sum : %d\n", sum);
		for (int i = 0; i < LIMIT; i += 2)
			avg += num[i];
		
		avg /= 5;
		System.out.printf("avg : %.1f\n", avg);

	}

}