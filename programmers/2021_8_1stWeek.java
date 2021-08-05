class Solution {
  //자료형 주의!
    public long solution(int price, int money, int count) {
        long answer = -1;

        Long result = new Long(money);
        for(int i = 1;i<=count;i++){
            result = result - (price * i);
        }
        if(result>=0){
            answer = 0;
        }
        else{
            answer = result*(-1);
        }
        return answer;
    }
}
