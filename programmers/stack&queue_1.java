//기능개발
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>(); 
        Queue<Integer> qp = new LinkedList<>(); 
        Queue<Integer> qs = new LinkedList<>(); 
        int day = 1;
        for(int i=0;i<progresses.length;i++){
            qp.add(progresses[i]);
        }
        for(int j=0;j<speeds.length;j++){
            qs.add(speeds[j]);
        }
        while(!qp.isEmpty()){
            int cnt = 0;
            while(qp.peek()+(qs.peek()*day)<100){
                day++;
            }
            while(!qp.isEmpty() && qp.peek()+(qs.peek()*day)>=100){
                qp.poll();
                qs.poll();
                cnt++;
            }
            if(cnt>0){
                arr.add(cnt);
            }
            answer = new int[arr.size()];
            for(int i = 0;i<arr.size();i++){
                answer[i] = arr.get(i);
            }
        }

        return answer;
    }
}
