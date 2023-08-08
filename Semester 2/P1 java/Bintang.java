import java.util.Scanner;
public class Bintang {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan nilai: ");
		int n = input.nextInt();
		System.out.print("Masukkan lagi: ");
		int m = input.nextInt();
		
		for (int y = 1; y <= m; y++){
			for (int x = 1; x <= n; x++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
