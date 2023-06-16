package while_;

public class TestClass08 {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for(int k = 0; k < 5; k++) {
				System.out.println(i + ", " + k);
			}
			System.out.println("-------");
		}
		
		for(int a = 2; a <= 9; a++) {
			for(int b = 1; b <=9; b++) {
				System.out.println(a +" * "+ b + " = " + a * b);	
			}
			System.out.println("--------------");
		}
	}
}
