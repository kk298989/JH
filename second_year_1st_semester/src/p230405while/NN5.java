package p230405while;

public class NN5 {

	public static void main(String[] args) {
		int n;
		int i = 0;
		int sum = 0;
		n = 3;
		while(i<100) {
			if((i+1)%2==1) {
				sum = sum+n*(i+1);
			}
			i++;
		}
		System.out.printf("%d*%d= %d \n", n,i,n*i);
	}

}
