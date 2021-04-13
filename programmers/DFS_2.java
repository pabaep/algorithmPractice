//네트워크
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        for(int i = 0;i<n;i++){
            if(check[i]==false){
                dfs(computers, i, check);
                answer++;
            }
        }
        return answer;
    }
    boolean[] dfs(int[][] computers, int i, boolean[] check){
        check[i] = true;
        for(int k = 0;k<computers.length;k++){
            if(i!=k && check[k]==false && computers[i][k] == 1){
                check = dfs(computers, k, check);
            }
        }
        return check;
    }
}
