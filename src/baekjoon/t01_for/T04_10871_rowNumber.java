package baekjoon.t01_for;

import java.util.Scanner;
// 10871
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//	입력								  출력
//  10 5							1 4 2 3
//	1 10 4 9 2 3 8 5 7 6
public class T04_10871_rowNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 개수 : ");
		int input_num = sc.nextInt();
		
		System.out.print("최대 수: ");
		int max = sc.nextInt();
		
		String print = "";
		for(int i=0; i<input_num; i++) {
			int num = sc.nextInt();
			if(num < max) {
				print += num + " ";
			}
		}
		
		System.out.println(max + "보다 작은 값 : " + print); 
		
		sc.close();
	}
}
