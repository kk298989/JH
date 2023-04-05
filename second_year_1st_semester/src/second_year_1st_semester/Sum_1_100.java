package second_year_1st_semester;

public class Sum_1_100 {

	public static void main(String[] args) {
		int a = 0;
		int n = 100;
		int sum = 0;
		while (a<n) {
			sum += (a+1);
			a++;
		}
		System.out.println(sum);
	}

}
