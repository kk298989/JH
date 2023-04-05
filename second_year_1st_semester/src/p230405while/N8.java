package p230405while;

public class N8 {

	public static void main(String[] args) {
		int x,y,r;
		x=12;
		y=124;
		while(y!=0) {
			r=x%y;
			x=y;
			y=r;
		}
		System.out.print(x);
	}

}
