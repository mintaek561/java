import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���: ");
		number = input.nextInt();
		System.out.print("100�� ����� ������ �����ϴ�: ");
		for(int i = 1; i <= number; i++) {
			if(100 % i == 0)
				System.out.printf("%d ",i);
		}
	}

}
