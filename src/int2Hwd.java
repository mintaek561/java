import java.util.Scanner;

public class int2Hwd {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		number = input.nextInt();
		switch(number) {
		case 0:
			System.out.println("�ϳ�");
			break;
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		default:
			System.out.println("����");
			break;
		}

		

		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
