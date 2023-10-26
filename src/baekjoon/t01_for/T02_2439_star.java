package baekjoon.t01_for;

import java.util.Scanner;
// 2439
// 입력	       출력
//  5			*
//		   	   **
//		      ***
//		     ****
//		    *****
public class T02_2439_star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		String star = "";
		for(int i=0; i<number; i++) {
			for(int j=i; j<number-1; j++) {
				System.out.print(" ");
			}
			star += "*";
			System.out.println(star);
		}
		sc.close();
	}
}
