package practice;

public class QuickSortP {
	public static int[] sort(int[] a,int l,int r) {
		if(a.length==0) return null;
		if(l>r||r>a.length-1) return a;
		int partition = divide(a,l,r);
		System.out.println(partition);
		
		sort(a,l,partition-1);
		sort(a,partition+1,r);
		return a;
	}

	private static int divide(int[] a,int start,int end) {
		int base = a[end];
		while(start<end) {
			System.out.println("start: "+start+" end: "+end);
			while(start<end && a[start]<=base) start++;
			while(start<end && a[start]>base) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				end--;
			}
			while(start<end && a[end]>base) end--;
			while(start<end && a[end]<base) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
				start++;
			}
		}
		return end;
	}
public static void main(String[] args) {
		
		int[] a = new int[]{2,7,4,5,10,1,9,3,8,6};
		int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] d = new int[]{1,10,2,9,3,2,4,7,5,6};
			System.out.println(divide(a,0,a.length-1));
		sort(a,0,a.length-1);
			
		System.out.println("This is the result");
		for(int x : a){
			System.out.print(x+" ");
		}
	}
}
