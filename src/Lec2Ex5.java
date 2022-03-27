import java.util.Scanner;

public class Lec2Ex5 {

	public static void main(String[] args) {
		int i,num;
		double pi = 0;
		double a = 1;
		double b = 4;
		Scanner input = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하세요: ");
		num = input.nextInt();
		for(i = 1; i <= num ; i++) {
			pi = pi+(1/a) * b;
			a += 2;
			b *= -1;
		}
		System.out.println(pi);
		
	}

}
