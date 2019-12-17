/*
 * l = 左边起始位置， r = 右边的起始位置， rightEnd = 右边的终点位置
 */
public class Merge {
	public static void merge(int a[],  int l, int r, int rightEnd) {
		int leftEnd = r-1; //the end of the leftside, assume two arrays are close to each other
		int tmp = l;		//the begining spot of a array that used to store the results.
		int numElements = rightEnd - l +1;	//the number of all elements
		int tmpA[] = new int[a.length];
		
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
		
		for(int i=0; i<numElements; i++, rightEnd--){
			a[rightEnd] = tmpA[rightEnd];
		}
		
		
	}
	
public static void main(String[] args) {
		
		int[] a = new int[]{2,3,4,6,8,1,3,5,7,9};
		int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] d = new int[10];
			
		merge(a, 0, 5, 9);
			
		System.out.println("This is the result");
		for(int x : a){
			System.out.print(x+" ");
		}
	}
}
