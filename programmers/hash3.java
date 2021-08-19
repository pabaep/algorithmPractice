//위장
import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<clothes.length;i++){
            //옷 종류가 key, value 가 해당 옷 종류의 갯수
            if(map.get(clothes[i][1]) == null){
                map.put(clothes[i][1], 1);
            }
            else{
                map.put(clothes[i][1],map.get(clothes[i][1])+1);
            }
            
        }
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            answer *= map.get(key)+1;
        }
        return answer-1;
    }
}
