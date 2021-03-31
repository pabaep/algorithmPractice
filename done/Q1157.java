import java.io.*;

public class Q1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toUpperCase();
		char[] array = s.toCharArray();
		int[] list = new int [26];
		char result;
		
		for(int i = 0;i<s.length();i++) {
			list[array[i]-65]++;	
		}
		int max = list[0];
		int tmp = 0;
		for(int i = 1;i<26;i++) {
			if(list[i]>max) {
				max = list[i];
				tmp = i;
			}
			
		}
		result = (char) (tmp + 65);
		for(int i = 1;i<26;i++) {
			if(list[i]==max&&tmp!=i) {
				result = '?';
				break;
			}
			
		}
		System.out.println(result);

	}

}
