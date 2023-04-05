package p230405while;

public class N16 {

	public static void main(String[] args) {
		int i;
		i = 0;
		while(i<3) {
			switch((i+1)%3) {
			case 1 :
				System.out.println("one");
				break;
			case 2 :
				System.out.println("two");
				break;
			default :
				System.out.println("zero");
				break;
			}
			i = i+1;
		}
	}

}
