//우선순위 큐 이용하기

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue();
        for(int i = 0;i<scoville.length;i++){
            q.add(scoville[i]);
        }
        while(allPass(q,K)==false){
            if(q.size()==1){
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
