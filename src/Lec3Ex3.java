import java.util.Scanner;

public class Lec3Ex3 {

	public static void main(String[] args) {
		int cnt;
		System.out.print("1~1000사이의 정수중 소수 : ");
		for(int i = 2; i <= 1000; i++) {
			cnt = 0;
		    for(int j=2; j <= i; j++){
		            if(i % j == 0) 
		            	cnt++;            
		        }
		    if(cnt == 1)
		    	System.out.printf("%d ", i);
		}
	}
}
