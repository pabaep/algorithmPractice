// 더 맵게

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue();
        for(int i = 0;i<scoville.length;i++){
            q.add(scoville[i]); //우선순위 큐 안에 스코빌지수 배열 넣음
        }
        while(allPass(q,K)==false){ //조건에 부합하지 않는다면
            if(q.size()==1){ //음식이 하나 뿐이라면 -1 리턴
                answer = -1;
                break;
            }
            int first = (int)q.poll();
            int second = (int)q.poll();
            
            int result = first + (second * 2);
            q.add(result);
            answer++;
                
        }
        
        return answer;
    }
    
    //전체 음식이 스코빌 조건에 부합하는지 확인하는 함수
    public boolean allPass(PriorityQueue q, int K) {
        int num = (int)q.peek();
        if(num >= K){
            return true;
        }
        else{
            return false;
        }
    }
}
