
public class QuickSort {

	public static int divide(int[] a, int start, int end) {
		int base = a[end];
		
		while(start<end) {
			while(start<end && a[start]<=base) {
				start++;
			}
			if(start<end && a[start]>base) {
				int tmp = a[start];
				a[start]=a[end];
				a[end] = tmp;
				end--;
			}
			while(start<end && a[end]>=base) {
				end--;
			}
			if(start<end && a[end]<base) {
				int tmp = a[start];
				a[start]=a[end];
				a[end]=tmp;
				start++;
			}
		}
		return end;
		
	}
	
	public static void sort(int[] a, int start,int end) {
		if(start>end) {
			return;
		}
		else {
			int partition = divide(a,start,end);
			sort(a, start, partition-1);
			sort(a, partition+1, end);
		}
	}
	
	
	

public static void main(String[] args) {
		
	int[] a = new int[]{2,7,4,5,10,1,9,3,8,6};
	int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
	int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
	int[] d = new int[]{1,10,2,9,3,2,4,7,5,6};
		
	sort(a, 0, a.length-1);
		
	System.out.println("排序后的结果：");
	for(int x : a){
		System.out.print(x+" ");
	}
}

	
	
	
	
	
	
	
	
	
	
	
}
