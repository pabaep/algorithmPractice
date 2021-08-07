import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        Integer[] answer = set.toArray(new Integer[0]);
        Arrays.sort(answer);
        return answer;
            
            //set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
