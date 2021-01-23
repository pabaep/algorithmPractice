import java.util.*;

public class Q1920 {

	static int BSearchRecursive(int arr[], int target, int low, int high) {
		if (low > high)
	        return 0;

	    int mid = (low + high) / 2;
	    if (arr[mid] == target)
	        return 1;
	    else if (arr[mid] > target)
	        return BSearchRecursive(arr, target, low, mid-1);
	    else
	        return BSearchRecursive(arr, target, mid+1, high);
	}

	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);
		/*입력*/
		int n = s.nextInt();
		int[] nList = new int[n];
		for(int i = 0;i<n;i++) {
			nList[i] = s.nextInt();
		}
		int m = s.nextInt();
		int[] mList = new int[m];
		for(int i = 0;i<m;i++) {
			mList[i] = s.nextInt();
		}
		/*정렬*/
		Arrays.sort(nList);
		/*이분검색 후 프린트*/
		for(int i = 0;i<m;i++) {
			System.out.println(BSearchRecursive(nList,mList[i],0,nList.length - 1));
		}
		
	}

}
