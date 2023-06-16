package while_;

import java.util.Scanner;

public class TestClass04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0;
		while(true) {
			System.out.print("1 ~ 10 사이수 입력 : ");
			i = sc.nextInt();
			if(10 >= i && i > 0) 
				break;
			else if(i <= 0 || i > 10) {
				System.out.println("다시입력");
				continue;
			}
			for(int k = 1; k <= i;  k++) {
				sum += k;
			}
			System.out.println("1 ~ " + i + "까지의 합 : " + sum);
		}
	}
}
