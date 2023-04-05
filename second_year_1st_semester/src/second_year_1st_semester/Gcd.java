package second_year_1st_semester;
import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		int a,b,temp,sum;
		Scanner sc = new Scanner(System.in);
//		임의의 두 정수를 입력한다
		System.out.print("임의의 두 정수를 입력하시오: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		while (b >= a) {
            System.out.print("두번째 정수를 입력하세요(첫번째 정수보다 작은 값): ");
            b = sc.nextInt();
        }
	
		 while (b > 0) {
	            temp = b;
	            b = a % b;
	            a = temp;
	     }

	     sum = a;

	     System.out.println("두 수의 최대공약수는 " + sum + "입니다.");
		
	}

}

