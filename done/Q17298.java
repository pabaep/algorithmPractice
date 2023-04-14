import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// 20230414
public class Q17298 {

    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 입력받은 n

        String inputStr = br.readLine(); // 이후 입력 받은 String
        String array[] = inputStr.split(" "); // " "로 숫자 구분해서 배열에 넣기

        // 메인 스택 선언
        Stack<Integer> mainStack = new Stack<>();

        // 정답 스택 선언
        Stack<Integer> answerStack = new Stack<>();

        // 메인 스택에 최초 push 값은 무조건 input 배열의 제일 끝 값
        mainStack.push(Integer.parseInt(array[n-1]));

        // 정답 스택에 최초 push 값은 무조건 -1
        answerStack.push(-1);

        int tmpInt = 0;

        for(int i = n-2; i>=0; i--) {
            // System.out.println(array[i]);
            tmpInt = Integer.parseInt(array[i]);

            while(!mainStack.isEmpty()) {
                if(tmpInt < mainStack.peek()) {
                    answerStack.push(mainStack.peek());
                    break;
                }
                else {
                    mainStack.pop();
                }
            }

            if(mainStack.isEmpty()) {
                answerStack.push(-1);
            }

            // 자기 자신은 항상 main 스택에 푸시
            mainStack.push(tmpInt);

        }

        // 스택 안에 쌓인 값 차례로 String으로 만들어서 한번에 출력
        while(!answerStack.isEmpty()) {
            sb.append(answerStack.pop()).append(" ");
        }

        System.out.println(sb);
    }
}
