import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double PI = 3.141592;
		double radius;
		double area;
		System.out.println("�������� �Է��Ͻÿ�.");
		radius = input.nextDouble();
		area = PI * radius * radius;
		System.out.println("��������" + radius + "�� ���� ������" + area + "�Դϴ�.");
		
	}

}
