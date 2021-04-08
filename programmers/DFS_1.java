class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int start = numbers[0]; //target이랑 같아지는지 확인할 변수, 계속 증감 함
        
        answer = dfs(1,start,numbers,target)+dfs(1,-start,numbers,target);
        return answer;
    }
    int dfs(int index, int start, int[] numbers, int target){
        if(index == numbers.length){//돌만큼 다 돌았다
            if(start==target){
                return 1; //카운트에 1을 더함
            }
            else{
                return 0; //카운트에 아무것도 안더함(조건과 맞지 않음)
            }
        }
        int result = 0;
        result += dfs(index+1, start+numbers[index],numbers, target);
        result += dfs(index+1, start-numbers[index],numbers, target);
        return result;
    }
}
