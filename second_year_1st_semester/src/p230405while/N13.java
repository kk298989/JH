package p230405while;

public class N13 {

	public static void main(String[] args) {
		int a,b,x,y,r;
		a = 48;
		b = 12;
		if (a>b) {
			x=a;
			y=b;
		}
		else {
			x=b;
			y=a;
		}
		int i = 0;
		int gcd = 1;
		while(i<b) {
			if((x%(i+1)==0)&&(y%(i+1)==0)) {
				gcd = (i+1);
			}
			i = i+1;
		}
		System.out.println(a+"와 "+b+gcd);
	}

}
