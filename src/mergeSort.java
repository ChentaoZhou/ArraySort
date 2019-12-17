import java.util.Arrays;

public class mergeSort {
	public static void merge(int a[], int tmpA[], int l, int r, int rightEnd) {
		int leftEnd = r-1; //the end of the leftside, assume two arrays are close to each other
		int tmp = l;		//the begining spot of a array that used to store the results.
		int numElements = rightEnd - l +1;	//the number of all elements
		
		while(l <= leftEnd && r <= rightEnd) {
			if(a[l] <= a[r]) tmpA[tmp++] = a[l++];
			else			 tmpA[tmp++] = a[r++];
		}
		/*
		 * 复制左边剩下的
		 */
		while(l <= leftEnd)
			tmpA[tmp++] = a[l++];
		/*
		 * 复制右边剩下的
		 */
		while(r <= rightEnd)
			tmpA[tmp++] = a[r++];
		
//		for(int i=0; i<numElements; i++, rightEnd--){
//			a[rightEnd] = tmpA[rightEnd];
//		}
		
		
	}

	/*
	 * 此方法里的merge方法和递归模式中不一样，最后的结果存在tmpA数组中，而不是a数组。
	 */
	public static void mergePass(int[] a, int[] tmpA, int n, int length) {
		int i;
		for (i = 0; i <= n - 2 * length; i += 2 * length) {
			merge(a, tmpA, i, i + length, i + 2 * length - 1);
		}
		if (i + length < n)
			merge(a, tmpA, i, i + length, n - 1);
		else {
			for (int j = i; j < n; j++) {
				tmpA[j] = a[j];
			}
		}
	}

	/*
	 * 非递归模式
	 */
	public static void mergeSort(int[] a) {
		int[] tmpA = new int[a.length];
		int n = a.length;
		int length = 1;
		while (length < n) {
			mergePass(a, tmpA, n, length);
			length *= 2;
			mergePass(tmpA, a, n, length);
			length *= 2;
		}
	}

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 6, 8, 1, 3, 5, 7, 9, 11, 13, 24, 44, 88, 99, 1234 };
		int[] b = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] c = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] d = new int[10];

		mergeSort(a);

		System.out.println("This is the result");
//		String s = Arrays.toString(c);
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

}
