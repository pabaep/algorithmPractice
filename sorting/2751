#include <stdio.h>
#include <cmath>
#pragma warning (disable:4996)
#define MAX 1000000
//백준 2751번
class MergeSort {
	int list[MAX];
	int n; 
	int left, right;
public:
	static void merge(int list[], int left, int mid, int right) {
		int i, j, k = left, l;
		static int sorted[MAX];
		for (i = left, j = mid + 1; i <= mid && j <= right;)
			sorted[k++] = (list[i] <= list[j]) ? list[i++] : list[j++];
		if (i > mid) {
			for (l = j; l <= right; l++, k++)
				sorted[k] = list[l];
		}
		else {
			for (l = i; l <= mid; l++, k++)
				sorted[k] = list[l];
		}
		for (l = left; l <= right; l++)
			list[l] = sorted[l];
	}
	void mergeSort(int list[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(list, left, mid);
			mergeSort(list, mid + 1, right);
			merge(list, left, mid, right);
		}
	}
	void setListAndSort() {
		scanf("%d", &n);
		for (int i = 0; i < n; i++) {
			scanf("%d", &list[i]);
		}
		left = 0;
		right = n-1;
		mergeSort(list, left, right);
	}
	void printList() {
		//printf("\n");
		for (int i = 0; i < n; i++) {
			printf("%d\n", list[i]);
		}
	}
};
int main()
{
	MergeSort m;
	m.setListAndSort();
	m.printList();

	return 0;
}
