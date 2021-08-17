//전화번호 목록
import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String,Integer> map = new HashMap<>();
        
        //해시맵의 키에 값을 저장하고 value에 인덱스를 부여
        for(int i = 0;i<phone_book.length;i++){
            map.put(phone_book[i],i);
        }
        
        for(int k = 0;k<phone_book.length;k++){
            for(int j = 1;j<phone_book[k].length();j++){
                if(map.containsKey(phone_book[k].substring(0,j))){
                    answer = false;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}
