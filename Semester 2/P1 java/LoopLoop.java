
public class LoopLoop {
	
	public static void main (String[] args) {
		
		for (int a = 1; a <= 10; a++){
			if (a % 3 == 0){
				continue;
			}
			
			if (a == 7){
				break;
			}
			System.out.println(a);
		}
		boolean batal = false;
		
		loop_1:
		for (int i = 1; i <= 5 && !batal; i++){
			loop_2:
			for (int j = 1; j <= 3; j++){
				if (i * j == 2){
					continue;
				} 
				if (i * j == 8){
					batal = true;
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
	}
}

