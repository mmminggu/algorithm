package baekjoon.t01_for;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class T01_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Case Number : ");
		int case_num = sc.nextInt();
		for(int i=1; i<=case_num; i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			
			int sum = first + second;
			System.out.println("Case #" + i + ": " + first + " + " + second + " = " + sum);
		}
		
		sc.close();
	}
	
	public void buffered() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer token;
		for(int i=0; i<n; i++) {
			token = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken())) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
