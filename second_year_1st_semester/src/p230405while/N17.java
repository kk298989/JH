package p230405while;

public class N17 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		i=0;
		int k;
		while(i<30) {
			k = i+1;
			if(k%3==2) {
				sum = sum+k;
			}
			i = i+1;
		}
		System.out.println(sum);
	}

}
