import java.util.Scanner;

public class Lec2Ex1{
	public static void main(String[] args) {
		int number1,number2;
		Scanner input = new Scanner(System.in);
		System.out.print("두 정수를 입력하시오 : ");
		number1 = input.nextInt();
		number2 = input.nextInt();
		if(number1 > number2){
			System.out.println(number1 + "이 더 큽니다");
		}
		else{
			System.out.println(number2 + "이 더 큽니다");
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}
}