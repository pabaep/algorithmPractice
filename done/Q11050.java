import java.util.*;

public class Q11050 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		System.out.println(bino_coef(n,k));

	}
	static int bino_coef(int n,int k) {
		if(k == 0 || n == k) {
			return 1;
		}
		return bino_coef(n-1,k)+bino_coef(n-1,k-1);
	}
}
