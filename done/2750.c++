#include <stdio.h>
#pragma warning (disable:4996)
#define MAX 1000
class ShellSort {
	int list[1000], n; //n은 정렬할 숫자 개수
public:
	void shellSort()
	{
		int i, gap, count = 0;
		for (gap = n / 2; gap > 0; gap = gap / 2) {
			if ((gap % 2) == 0)gap++;
			for (i = 0; i < gap; i++) {
				sortGapInsertion(list, i, n - 1, gap);
			}
		}
	}
	static void sortGapInsertion(int list[], int first, int last, int gap)
	{
		int i, j, key;
		for (i = first + gap; i <= last; i = i + gap) {
			key = list[i];
			for (j = i - gap; j >= first && list[j] > key; j = j - gap)
				list[j + gap] = list[j];
			list[j + gap] = key;
		}
	}
	void setList() {
		scanf("%d", &n);
		for (int i = 0; i < n; i++) {
			scanf("%d", &list[i]);
		}
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
	ShellSort s;
	s.setList();
	s.shellSort();
	s.printList();
	return 0;
}
