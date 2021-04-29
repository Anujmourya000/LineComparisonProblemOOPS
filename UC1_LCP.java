
public class UC1_LCP {
	
	static void Distance() {
		
		int x1 = 2;
		int x2 = 4;
		int y1 = 6;
		int y2 = 10;
		
		double length_of_line = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		System.out.println("length of the line = " +length_of_line);
		
	}

	public static void main(String[] args) {
		
		Distance();
	}

}
