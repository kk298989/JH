package p230405while;

public class N6 {

	public static void main(String[] args) {
		int n;
		int i = 0;
		int sum = 0;
		n = 3;
		while(i<25) {
			if((i+1)%2==0) {
				sum = sum + n * (i+1);
			}
			i++;
		}
		System.out.print(sum);
	}

}
