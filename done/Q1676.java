import java.util.*;

public class Q1676 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = 0;
		while(n >= 5) {
			result += n/5;
			n /= 5;
		}
		System.out.println(result);
	}
	
}
