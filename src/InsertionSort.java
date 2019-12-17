
public class InsertionSort {
	public static void insertSort(int[] a,int n) {
		for(int p=1; p<n; p++) {
			int tmp=a[p];
			int i;
			for(i=p; i>0 && a[i-1]>tmp; i--) {
				a[i]=a[i-1];
			}
			a[i]=tmp;
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = new int[]{3,7,4,5,10,1,9,3,8,6};
		int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] d = new int[]{1,10,2,9,3,2,4,7,5,6};
			
		insertSort(a, a.length);
			
		System.out.println("This is the result");
		for(int x : a){
			System.out.print(x+" ");
		}
	}
}
