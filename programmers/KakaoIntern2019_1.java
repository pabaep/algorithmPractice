//크레인 인형뽑기
import java.util.*;
class Solution {
    int a = 0;
    int b = 0;
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int doll = 0;//움직이는 인형
        Stack<Integer> st = new Stack<>(); 
        for(int i = 0;i<moves.length;i++){//각 moves에 해당하는 라인?
            doll = intPeek(board,moves[i]-1);

            if(doll != 0){
                board[a][b] = 0;
                if(!st.empty()){
                    if(st.peek()==doll){
                        answer += 2;

                        st.pop();
                    }
                    else{
                        st.push(doll);
                    }
                }
                else{
                    st.push(doll);
                }
            }
        }
        int h = 1;
        /*
        while(!st.empty()){
            System.out.print(st.pop());
            h++;
        }
        */
        return answer;
    }
    int intPeek (int[][] board,int m){
        int result = 0;
        for(int j = 0;j<board.length;j++){
            if(board[j][m] != 0){
                result = board[j][m];
                a = j;
                b = m;
                //System.out.println(a+","+b);
                break;
            }
        }
        return result;
    }
}
