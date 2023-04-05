package second_year_1st_semester;
import java.util.Scanner;
public class number {

	public static void main(String[] args) {
		int n;
		String sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하시오: ");
		n = sc.nextInt();
		
		if (n == 0) {
			sum = "없음";
		} 
		else {
			if (n == 1) {
				sum = "하나";
			} 
			else {
				if(n == 2) {
					sum = "둘";
				} 
				else {
					sum = "많음";
				}
			}
		}
		System.out.println(sum);
	}

}
