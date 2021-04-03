//완주하지 못한 선수
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0;i<completion.length;i++){
            if(!completion[i].equals(participant[i])){
                answer = participant[i];
                break;
            }
            else{
                answer = participant[i+1];
            }
        }
        
        return answer;
    }
}
