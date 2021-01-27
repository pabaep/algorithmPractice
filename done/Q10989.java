import java.io.*;

public class Q10989 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		int[] array = new int[n];
		int[] cntArray = new int [10001];
		int[] result = new int[n];
		for(int i = 0; i<n ; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		/*카운팅 정렬*/
		for(int i = 0 ; i<n ; i++) {
			cntArray[array[i]]++;
		}
		//누적합 해주기
		for(int i = 1; i<cntArray.length; i++) {
			cntArray[i] += cntArray[i - 1];
		}
		//result에 최종 정렬 값 넣기
		/*
		 *  i 번째 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤 
		 *  counting 배열의 값을 인덱스로 하여 result에 value 값을 저장한다.
		 */
		for(int i = n - 1; i>=0; i--) {
			int tmp = array[i];
			cntArray[tmp]--;
			result[cntArray[tmp]] = tmp;
		}
		for(int i = 0;i<n;i++) {
			//System.out.println(result[i]);
			sb.append(""+result[i]+"\n");
		}
		System.out.println(sb.toString());
	}

}
