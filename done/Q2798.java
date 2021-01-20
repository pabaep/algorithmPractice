import java.util.Scanner;

public class Q2798 {

	public static void main(String[] args) {
		int temp = 0;//m과 최대한 가까운 값
		int testNum;
		/*입력받기*/
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] numList = new int[100];
		for(int i=0;i<n;i++) {
			numList[i] = s.nextInt();
		}
		/*계산 부분*/
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					testNum = numList[i]+numList[j]+numList[k];
					if(testNum<=m) {
						if(testNum>temp) {
							temp = testNum;
						}
					}
				}
			}
		}

		/*출력하기*/
		System.out.println(temp);

	}

}
