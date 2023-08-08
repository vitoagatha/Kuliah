
public class Program {
	
	static String name = "Ani";
	
	public static void main (String[] args) {
		String name = "Budi";
		sayHello();
		System.out.println("Nama: " + name);
		System.out.println("Nama Atas: " + Program.name);
		Recursion.print("Hello", 3);
		
	}
	
	public static void sayHello(){
		System.out.println("Hello " + name);
		name = "Andi";
	}
}

