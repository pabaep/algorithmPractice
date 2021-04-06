import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int[] tmp;
        answer = new int[commands.length];
        for(int i = 0;i<commands.length;i++){
            tmp = new int[commands[i][1]-commands[i][0]+1];
            int a = commands[i][0];
            for(int j = 0;j<(commands[i][1]-commands[i][0]+1);j++){
                tmp[j] = array[a-1];
                a++;
            }
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2]-1];
        }
        return answer;
    }
}
