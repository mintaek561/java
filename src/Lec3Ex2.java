import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		number = input.nextInt();
		System.out.print("100의 약수는 다음과 같습니다: ");
		for(int i = 1; i <= number; i++) {
			if(100 % i == 0)
				System.out.printf("%d ",i);
		}
	}

}
