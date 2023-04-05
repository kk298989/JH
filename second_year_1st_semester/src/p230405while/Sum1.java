package p230405while;
import java.util.Scanner;
public class Sum1 {
//	n을 키보드로 부터 입력받아
//	1에서 n까지의 합을 출력하시오
	public static void main(String[] args) {
		int n,i,sum,key;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		key = sc.nextInt();
		sum=0;
		i=0;
		
		while(i<n) {
			sum = sum + (i+1);
			i++;
		}
		System.out.printf("1에서 %d까지의 합은: %d\n",n,sum);
		i = 0;
		while(i<n) {
			if((i+1)%2==0) {
				System.out.println((i+1)+": 짝수");
			}
			else {
				System.out.println((i+1)+": 홀수");
			}
			i++;
		}
		//1 :
		//2 :
		//3 : 3의 배수
			
		i = 0;
		while(i<n) {
			if((i+1)%3==0) {
				System.out.println((i+1)+": 3의 배수");
			}
			else {
				System.out.println((i+1) + " ");
			}
			i++;
		}
		//n까지의 3의 배수의 합을 구하시오.
		i = 0;
		sum = 0;
		while(i<n) {
			if((i+1)%3==0) {
				sum += (i+1);
			}
			i++;
		}
		System.out.println(key+"의 배수의 합: "+ sum);
		//n까지의 3의 배수를 출력하시오. 3,6, .....
		i = 0;
		
		while(i<n) {
			if((i+1)%key==0) {
				if(key != (i+1)) {
					System.out.print(", "+ (i+1));
				}
				else {
					System.out.print((i+1));
				}
			}
			i++;
		}
		
		
	}
}
