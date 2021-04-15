//카카오인턴쉽 2020 -- 1. 키패드 누르기
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int Lcurrent = 10; // "*"==10
        int Rcurrent = 12; // "#"==12
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) { // Left
				answer += "L";
				Lcurrent = numbers[i];
			} 
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {	// Right
				answer += "R";
				Rcurrent = numbers[i];
			}
            else{
                int Llength = getLength(Lcurrent, numbers[i]);
                int Rlength = getLength(Rcurrent, numbers[i]);
                if(Llength>Rlength){
                    answer += "R";
				    Rcurrent = numbers[i];
                }
                else if(Llength<Rlength){
                    answer += "L";
				    Lcurrent = numbers[i];
                }
                else{
                    if(hand.equals("left")){
                        answer += "L";
				        Lcurrent = numbers[i];
                    }
                    else{
                        answer += "R";
				        Rcurrent = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
    // 가운데 숫자 일경우 거리 구하기
    public static int getLength(int index, int number) {

		// 숫자 0의 경우 11로 치환
		index = (index == 0) ? 11 : index;	
		number = (number == 0) ? 11 : number;

		int x = (index - 1) / 3;
		int y = (index - 1) % 3;
		int numberX = number / 3;
		int numberY = 1;

		return Math.abs(x-numberX) + Math.abs(y-numberY);
	}
}
