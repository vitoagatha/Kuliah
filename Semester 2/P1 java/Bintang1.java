import java.util.Scanner;
public class Bintang1 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan nilai: ");
		int n = input.nextInt();
		
		for (int y = n; y >= 1; y--){
			for (int x = 1; x <= y; x++){
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}
