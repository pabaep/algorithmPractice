//package done;

import java.util.Scanner;

public class Q1629 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//x의 n제곱을 k로 나눈다고 가정
		int a = s.nextInt(); //x
		int b = s.nextInt(); //n
		int c = s.nextInt(); //k
		
		System.out.println(cal(a % c, b, c));
	}
	/*
	 x의 n제곱일때 n이 짝수 일 경우 x^n = x^(n/2) * x^(n/2)
	 x의 n제곱일때 n이 홀수 일 경우 x^n = x^(n/2) * x^(n/2) * x
	 라는 성질을 이용해서 문제를 해결하면 됨
	 분할정복은 문제를 가장 작은 단위까지 쪼갠다음에 이를 conquer하는 방식 이므로 이 경우 n이 1이 될때까지 쪼갠 다음 이를 conquer하면 됨
	 문제의 예로 코드의 전개를 보면 다음과 같음
	 10^11 = 10^5 * 10^5 * 10
	 10^5 = 10^2 * 10^2 * 10
	 10^2 = 10^1
	 */
	private static long cal(int a, int b, int c) {
		// b가 1일 때는 나머지가 바로 a
		if(b == 1) { 
			return a;
		}
		
		/*divide*/
		long temp = cal(a, b / 2, c) % c; 
		
		/*conquer*/
		// b가 짝수일 때 
		if(b % 2 == 0) {
			return (temp * temp) % c;
		// b가 홀수일 때 
		} 
		else {
			return (((temp * temp) % c) * a) % c;
		}
		
	}
}
