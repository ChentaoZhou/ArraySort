package practice;

public class MergeSortP {

	public static void mergeSort(int[] a) {
		int n = a.length;
		int[] temp= new int[n];
		sort(a,temp,0,n-1);
		
	}

	private static void sort(int[] a, int[] temp, int l,int rightend) {
		int mid;
		if(l<rightend) { 
			mid = (l+rightend)/2;
			sort(a,temp,l,mid);
			sort(a,temp,mid+1,rightend);
			merge(a,temp,l,mid+1,rightend);
		}
	}

	private static void merge(int[] a, int[] temp, int l,int r,int rightend) {
		int leftend = r-1;
		int tem = l;
		int numElements = rightend -l+1;
		
		while(l<=leftend && r<=rightend) {
			if(a[l]<=a[r]) temp[tem++] = a[l++];
			else temp[tem++] = a[r++];
		}
		while(l<=leftend) {
			temp[tem++] = a[l++];
		}
		while(r<=rightend) {
			temp[tem++] = a[r++];
		}	
		for(int i=0;i<numElements;i++,rightend--) {
			a[rightend] = temp[rightend];
		}
	}
public static void main(String[] args) {
		
		int[] a = new int[]{2,7,4,5,10,1,9,3,8,6};
		int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] d = new int[]{1,10,2,9,3,2,4,7,5,6};
		mergeSort(a);
			
		System.out.println("This is the result");
		for(int x : a){
			System.out.print(x+" ");
		}
	}
}
