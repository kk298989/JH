package p230405while;
import java.util.Scanner;
public class Gcd1 {

	public static void main(String[] args) {
		int x,y,r;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		int x1 = x;
		int y1 = y;
		if(x<y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		while(y!=0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.printf("%d와 %d의 최대공약수는 %d",x1,y1,x);
	}

}
