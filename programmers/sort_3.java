//H-index
import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0;i<citations.length;i++){
            //i+1이 h번 이상 인용된 논문 편수
            if(arr[i]>=i+1){
                answer = i+1;
                
            }

            else{
                break;
            }
            
        }
        return answer;
    }
}
