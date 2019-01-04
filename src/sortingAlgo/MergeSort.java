package sortingAlgo;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = {1,2,3,1,4,5}; //{ 12, 11, 13, 5, 6, 7 };
		System.out.println("Input array : " + Arrays.toString(a));
		mergeSort(a, 0, a.length-1);
		System.out.println("Sorted array : " + Arrays.toString(a));
	}

	private static void mergeSort(int[] a, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge(a, low, mid, high);
		}
	}

	private static void merge(int[] a, int low, int mid, int high) {
		int s1 = mid - low + 1;
		int s2 = high - mid;
		int[] L = new int[s1];
		int[] R = new int[s2];

		for (int i = 0; i < s1; ++i)
			L[i] = a[low + i];
		for (int j = 0; j < s2; ++j)
			R[j] = a[mid + 1 + j];

		int i = 0;
		int j = 0;
		int k = low;

		while (i < L.length && j < R.length) {
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			}
			else if (L[i] > R[j]) {
				a[k] = R[j];
				j++;
			}
			k++;
		}

		while (i != L.length) {
			a[k] = L[i];
			i++;
			k++;
		}

		while (j != R.length) {
			a[k] = R[j];
			j++;
			k++;
		}
	}
}
