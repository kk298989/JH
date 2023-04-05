package second_year_1st_semester;

public class Wdb {

	public static void main(String[] args) {
		int x = 14;
		int y = 15;
		int x1 = 0x11;
		int y1 = 0x22;
		int nextx = x;
		int nexty = ++y;
		if((x==nextx)||(y!=nexty)) {
			System.out.printf("%x",(x1 & y1));
		}
		else {
			System.out.printf("%x",(x1|y1));
		}
		}

}
