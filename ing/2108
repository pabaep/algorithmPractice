#include <stdio.h>
#include <cmath>
#pragma warning (disable:4996)
#define MAX 500000
//백준 2108번
//풀다 말았음... 다시 풀어봐야지
class MergeSort {
	int list[MAX];
	int n; // n은 홀수라고 가정
	int left, right;
public:
	static void merge(int list[], int left, int mid, int right) {
		int i, j, k = left, l;
		static int sorted[MAX];
		for (i = left, j = mid + 1; i < mid && j <= right;)
			sorted[k++] = (list[i] <= list[j] ? list[i++] : list[j++]);
		if (i > mid) {
			for (l = j; l = right; l++, k++)
				sorted[k] = list[l];
		}
		else {
			for (l = i; l <= mid; l++, k++)
				sorted[k] = list[l];
		}
		for (l = left; l <= right; l++)
			list[l] = sorted[l];
	}
	void mergeSort(int list[],int left, int right) {
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
	int arithmeticalAverage() {//산술평균 값
		int sum = 0,avgr;
		double avg;
		for (int i = 0; i < n; i++) {
			sum += list[i];
		}
		avg = sum / n;
		avgr = round(avg);
		return avgr;
	}
	int median() {//중앙값
		int mid = (n / 2);
		return list[mid];
	}
	int mode() {//최빈값
		int count[MAX];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (list[i] == list[j])
					count[i]++;
			}
		}
		
	}
	int range() {//범위
		int result;
		result = list[n - 1] - list[0];
		return result;
	}
	void printResert() {
		printf("%d", arithmeticalAverage());
		printf("%d", median());

		printf("%d", range());
	}
};
