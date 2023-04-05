package p230405while;

public class N12 {

	public static void main(String[] args) {
		int a,b,x,y,r;
		a=36;
		b=48;
		if(a>b) {
			x=a;
			y=b;
		}
		else {
			x=b;
			y=a;
		}
		while(y!=0) {
			r= x%y;
			x=y;
		    y=r;
		}
		System.out.println("r"+a+b+x);
	}

}
