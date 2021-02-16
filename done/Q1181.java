import java.util.*;
import java.util.Map.*;
import java.io.*;

public class Q1181 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		String tmp;
		StringBuilder sb = new StringBuilder();
		
		int n = s.nextInt();
		
		for(int i = 0;i<n;i++) {
			tmp = s.next();
			hm.put(tmp,tmp.length());
		}
		
		// Map.Entry 리스트 작성
		List<Entry<String, Integer>> listEntry = new ArrayList<Entry<String, Integer>>(hm.entrySet());
		
		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(listEntry, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				if(obj1.getValue().compareTo(obj2.getValue())==0){
					// 길이(value)가 같다면 단어의 알파벳(key)순으로 추가 정렬 
					return obj1.getKey().compareTo(obj2.getKey());
				}
				else { // 오름 차순 정렬
					return obj1.getValue().compareTo(obj2.getValue());
				}
			}
		});
		
		// 결과 출력
		for(Entry<String, Integer> entry : listEntry) {
			sb.append(entry.getKey()+"\n");
		}
		System.out.println(sb);
	}

}
