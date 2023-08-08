public class numberPuzzles4 {
	public static void main(String[] args) {
		for (int a = 0; a <=45 ; a++) {
			for (int b = 0; b <= 45; b++) {
				for (int c = 0; c <= 45; c++) {
					for (int d = 0; d <= 45; d++) {
						//System.out.println(a + "" + b + "" + c + "" +d);
						int and = a + b + c + d;
						int trueA = a + 2;
						int trueB = b - 2;
						int trueC = c * 2;
						int trueD = d / 2;
						
						if (and == 45 && trueA == trueB && trueB == trueC && trueD == trueC) {
							System.out.println(and);
							System.out.println(a);
							System.out.println(b);
							System.out.println(c);
							System.out.println(d);
						


							
							}
						
						}
					
					
					}
				
				
				}
			
			
			
			}
		
		
		
		
		}
	
	
	
	
	}