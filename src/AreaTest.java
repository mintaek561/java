import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double PI = 3.141592;
		double radius;
		double area;
		System.out.println("반지름을 입력하시오.");
		radius = input.nextDouble();
		area = PI * radius * radius;
		System.out.println("반지름이" + radius + "인 원의 면적은" + area + "입니다.");
		
	}

}
