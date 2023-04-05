package second_year_1st_semester;
import java.util.Scanner;
public class Multiple1 {

	public static void main(String[] args) {
		int i;
		int n,key;
		n = 99;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		key = sc.nextInt();
		// 1 : 홀수
		// 2 : 짝수
		// 3 : 홀수
		// 4 : 짝수
		// i를 100까지 증가시키는 while문을 작성한다
		i = 0;
		while(i<n) {
			if((i+1)%2==0) {
				System.out.println((i+1)+" : 짝수");
			} 
			else {
				System.out.println((i+1)+" : 홀수");
			}
			i++;
		}
		i = 0;
		while (i<n) {
			if((i+1)%key==0) {
				System.out.println((i+1) + " : "+ key +"의 배수");
			}
			else {
				System.out.println((i+1) + " : ");
			}
			i++;
		}
		i = 0;
		while(i<n) {
			if((i+1)%key==0) {
				if(key != (i+1)) {
					System.out.print(", "+(i+1) );
				}
				else {
					System.out.print((i+1));
				}
			}
			i++;
		}
		i=0;
		int sum = 0;
		while(i<n) {
			if((i+1)%key==0) {
				sum = sum + (i+1);
			}
			i++;
		}
		System.out.println(sum);
	}
	
}
