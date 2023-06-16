package while_;

public class TestClass07 {
	public static void main(String[] args) {
		for(int k =0; k < 3; k++) {
			System.out.println("===상위 반복문 시작");
			System.out.println(k + ".for1");
			for(int i = 0; i < 3; i++) {
				System.out.println( i + ".for2");
			}
			System.out.println("상위 반복문 종료===");
		}
		
		int kk = 0, ii = 0;
		while(kk < 3) {
			System.out.println("===상위 반복문 시작");
			System.out.println(kk + ".while1");
			while(ii < 3) {
				System.out.println( ii + ".while2");
				ii++;
			}
			System.out.println("상위 반복문 종료===");
			kk++;
			ii = 0;
		}
	}
}
