package while_;

import java.util.Scanner;

public class CodeTest_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("테스트케이스를 입력해주세요. : ");
		int test = sc.nextInt(); // 테스트케이스
			if(4 > test && test > 0) { //테스트케이스 횟수 확인
				
				for(int t = 1; t <= test; t++) { // 입력 반복
					System.out.print("부지의 크기를 입력해주세요. : ");
					int n = sc.nextInt(); // 부지의 크기
					if(15 > n && n > 3) { //부지 크기 확인
						
						System.out.print("건물의 높이를 입력해주세요. : ");
						int h = sc.nextInt(); // 건물의 높이
						
							if(15 > h && h > 3) { // 건물 높이 확인
							String park[][] = new String[n][n];
								for(int i = 0; i < n; i++) {
									for(int j = 0; j < n; j++) {
									park[i][j] = sc.next();
									if(park[i][j].equals("B") || park[i][j].equals("P") ) {
										
									}else {
										System.out.println("제대로 작성해주세요.");
										System.exit(0);
									}
									}	
									System.out.println("");
								}
								// ----------위에까지 테스트케이스, 부지크기, 건물높이, 건물 및 공원 입력
								// ----------여기부터 건물의 높이를 계산하고 높이를 합한 뒤, 입력한 건물높이와 같은 건물의 갯수를 저장할 것
									
									int sum = 0; // 건물의 높이를 모두 더할 변수
									int cnt = 0; // 건물높이와 같은 건물의 갯수를 저장할 변수
									
									for(int k = 0; k < n; k++) { // k가 위, 아래
										for(int m = 0; m < n; m++) { //m이 왼,오
											int hh = 0; //건물의 층을 확인할때 사용
											if(park[k][m].equals("B")) {
												
										}
									}
									}
								
							}else {
								System.out.println("건물의 높이는 3보다 작거나 14보다 크면 안됩니다.");
								System.exit(0);
							}						
						}else {
							System.out.println("부지의 크기는 3보다 작거나 14보다 크면 안됩니다.");
							System.exit(0);
						}
					}// 입력 반복 종료
					
		}else {
			System.out.println("테스트 케이스는 1보다 작거나 3보다 크면 안됩니다.");
		}								
	}
}
