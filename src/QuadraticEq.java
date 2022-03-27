import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double b;
		double c;
		double result;
		double sqr;
		System.out.println("상수 b와 c를 입력하세요.");
		b = input.nextInt();
		c = input.nextInt();
		sqr = Math.sqrt(b*b-4*c);
		if(sqr < 0) {
			System.exit(0);
		}
		result = (-b+sqr)/2;
		System.out.println(result);
	}

}
