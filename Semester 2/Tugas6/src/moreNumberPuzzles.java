import java.util.Scanner;

public class moreNumberPuzzles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1) Find two digit numbers <= 56 with sums of digits > 10\n2) Find two digit number minus number reversed which equals sum of digits\n3) Quit\n\n>");
		
		//first();
		int ans = scanner.nextInt();
		
		while (ans != 3) {
			System.out.println();
		if (ans == 1) first();
		System.out.println();
		if (ans == 2) second();
		if (ans == 3) {System.out.println("byebye"); break;}
		
		 ans = scanner.nextInt();
		
	}
		
		
		}
		
		static void first() {
			for (int i = 1; i <= 5; i++) {
				for (int n = 0; n <= 9; n++) {
					//System.out.println(i + "" + n);
					
					int a = i + n;
					
					// checking > 10
					
					if (a > 10) {
						
						//checking if <= 56
						if (i > 5 || n > 7) {
							System.out.println(i + "" + n);
							
							
							}
						
						
						} 
					
					
					}
				
				
				}
			
			
			}
	
		static void second() {
			for (int i = 1; i <= 9; i++) {
				for (int n = 0; n <= 9; n++) {
					int a = i + n;
					int big = i * 10 + n;
					int little = n * 10 + i;
					int check = big - little;
				//	System.out.println(big + " " + little);
					if (a == check) {
					    System.out.println(big + " & " + little + " = " + check);
					    System.out.print(i + " + " + n + " = " + check);
					    
					    
					}
				    
					
				}
			
				
				
	     	}
		}
	
	}