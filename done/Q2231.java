import java.util.*;

public class Q2231 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = 0;//출력할 결과 값
		for(int i=0;i<n;i++) {
			int num = i; //생성자가 될 수 있는 변수
			int sum = 0; //각 자리수 합 변수
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if(sum + i == n) {
				result = i;
				break;
			}
		}	
		System.out.println(result);
	}

}
