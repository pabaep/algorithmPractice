//이중 우선순위큐
import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        
        Deque<Integer> dq = new ArrayDeque<>();
        int max = 0;
        int min = 0;
        for(String orders: operations){
            String[] order = orders.split(" ");
            int num = Integer.parseInt(order[1]);
            if(order[0].equals("I")){
                if(dq.size()==0){
                    min = num;
                    max = num;
                    dq.add(num);
                }
                else{
                    if(num==max&num==min){
                        max = num;
                        dq.addLast(num);
                    }
                    else if(num>=max){
                        max = num;
                        dq.addLast(num);
                    }
                    else if(num<=min){
                        min = num;
                        dq.addFirst(num);
                    }
                }
            }
            else if(order[0].equals("D")){
                if(dq.size()>0){
                    if(num == 1){
                        dq.pollLast();
                        if(dq.size()>0){
                            max = dq.peekLast();
                        }
                        else{
                            max = 0;
                        }
                    }
                    else if(num == -1){
                        dq.pollFirst();
                        
                        if(dq.size()>0){
                            min = dq.peekFirst();
                        }
                        else{
                            min = 0;
                        }
                    }
                }
            }
        }
        int[] answer = new int[2];
        if(dq.size()==0){
            answer[0] = 0;
            answer[1] = 0;
        }
        else{
            answer[0] = max;
            answer[1] = min;
        }
        
        return answer;
    }
}
