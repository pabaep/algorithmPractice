import java.util.*;

public class Q2839 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = -1;
		
		if (n == 4 || n == 7) {
			result = -1;
		}
		else if (n % 5 == 0) {
			result = (n / 5);
		}
		else if (n % 5 == 1 || n % 5 == 3) {
			result = (n / 5) + 1;
		}
		else if (n % 5 == 2 || n % 5 == 4) {
			result = (n / 5) + 2;
		}
		
		System.out.println(result);

	}

}
