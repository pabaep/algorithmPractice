import java.util.*;

public class Q1764 {
	public static HashSet<String> hs = new HashSet<String>();
	public static ArrayList<String> result = new ArrayList<String>();
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		for(int i = 0; i<n; i++) {
			hs.add(s.next());
		}
		for(int i = 0;i<m;i++) {
			String str = s.next();
			if(hs.contains(str)) {
				result.add(str);
			}
		}
		Collections.sort(result);
		System.out.println(result.size());
		for(int i = 0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
	}

}
