import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int leap;
		System.out.println("������ �Է��Ͻÿ�.");
		leap = input.nextInt();
		if(leap % 4 == 0){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}	

}
