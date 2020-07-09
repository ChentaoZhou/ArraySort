
public class Merge {
	public static void merge(int a[], int tmpA[], int l, int r, int rightEnd) {
		int leftEnd = r-1; //the end of the leftside, assume two arrays are close to each other
		int tmp = l;		//the begining spot of a array that used to store the results.
		int numElements = rightEnd - l +1;	//the number of all elements
		
		while(l <= leftEnd && r <= rightEnd) {
			if(a[l] <= a[r]) tmpA[tmp++] = a[l++];
			else			 tmpA[tmp++] = a[r++];
		}
		
		while(l <= leftEnd)
			tmpA[tmp++] = a[l++];
		
		while(r <= rightEnd)
			tmpA[tmp++] = a[r++];
		
		for(int i=0; i<numElements; i++, rightEnd--){
			a[rightEnd] = tmpA[rightEnd];
		}
		
		
	}
	
	public static void mSort(int[] a, int[] tmpA, int l, int rightEnd) {
		int center;
		if(l<rightEnd) {
			center = (l + rightEnd)/2;
			mSort(a, tmpA, l, center);
			mSort(a, tmpA, center+1, rightEnd);
			merge(a, tmpA,l, center+1, rightEnd);
		}
	}
	
	
	public static void mergeSort(int[] a) {
		int n = a.length;
		int[] tmpA = new int[n];
		
		mSort(a, tmpA, 0, n-1);
	}
	
	
	
	
	
	
public static void main(String[] args) {
		
		int[] a = new int[]{1,2,3,4,6,8,1,3,5,7,9,11,13,24,44,88,99,1234};
		int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] d = new int[10];
			
		mergeSort(a);
			
		System.out.println("This is the result");
		for(int x : a){
			System.out.print(x+" ");
		}
	}
}
