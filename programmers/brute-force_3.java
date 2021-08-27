//카펫
class Solution {
    public int[] solution(int brown, int yellow) {
        
        int x = 0;//가로
        int y = 0;//세로
        for(y = 3;y<=(brown+4)/2;y++){//세로 최소길이 3, 최대길이 x
            x = ((brown+4)/2)-y;
            if(x<y){
                break; //세로는 항상 가로보다 작거나 같아야 함
            }
            int tmpYellow = (x-2)*(y-2); //위에서 나온 가로 세로 길이를 통한 확인할 노란값
            if(yellow == tmpYellow){
                break;
            }
            
        }
        
        int[] answer = new int[] {x,y};
        return answer;
    }
}
