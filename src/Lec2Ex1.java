import java.util.Scanner;

public class Lec2Ex1{
	public static void main(String[] args) {
		int number1,number2;
		Scanner input = new Scanner(System.in);
		System.out.print("�� ������ �Է��Ͻÿ� : ");
		number1 = input.nextInt();
		number2 = input.nextInt();
		if(number1 > number2){
			System.out.println(number1 + "�� �� Ů�ϴ�");
		}
		else{
			System.out.println(number2 + "�� �� Ů�ϴ�");
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}