package day05;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0; // 각 층을 모두 더할 변수
		int cnt = 0; // 입력한 층과 같거나 높은 건물을 셀때 사용하는 변수
		int test, n, h; // 테스트케이스 ,부지의 크기, 건물의 높이를 작성할 변수
		
		System.out.print("테스트케이스를 입력하세요. : ");
		// 각 테스트케이스, 부지크기, 건물높이를 입력하고 해당하는 조건에 맞추는 코드
		test = sc.nextInt();
		if(1 > test || test > 4) {
			System.out.println("잘못 입력하셨습니다.");
			System.exit(0);
		}
		System.out.print("부지의 크기를 입력하세요. : ");
		n = sc.nextInt();
		if(3 > n || n > 15) {
			System.out.println("잘못 입력하셨습니다.");
			System.exit(0);
		}
		System.out.print("건물의 높이를 입력하세요. : ");
		h = sc.nextInt();
		if(3 > h || h > 15) {
			System.out.println("잘못 입력하셨습니다.");
			System.exit(0);
		}
		// ---------------------------------------------------------
		// 2차원 배열을 입력하는 공간
		String park[][] = new String[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				park[i][j] = sc.next();				
				if(park[i][j].equals("B") || park[i][j].equals("P")) {
				}else {
					System.out.println("잘못 입력하셨습니다.");
					System.exit(0);
				}
			}
			System.out.println("");
		}
		// 2차원배열 입력완료------------------------------------------------
		
		// 마지막으로 계산을 하는 장소 
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(park[i][j].equals("B")) {
					sum += 1;
					

					
						
					}
				}
			}
		

			System.out.println(sum);

		
		
	}
}
