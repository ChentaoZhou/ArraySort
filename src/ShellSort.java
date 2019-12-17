
public class ShellSort {
	public static void shellSort(int[] a) {
		for(int d= a.length/2; d>0; d/=2) { //the increase int sort number
			for(int p=d; p<a.length;p++) {
				int tmp = a[p];
				int i;
				for(i=p;i>=d && a[i-d]>tmp; i-=d) {
					a[i] = a[i-d];
				}
				a[i]=tmp;
			}
		}
	}
	
public static void main(String[] args) {
		
		int[] a = new int[]{2,7,4,5,10,1,9,3,8,6};
		int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] d = new int[]{1,10,2,9,3,2,4,7,5,6};
			
		shellSort(a);
			
		System.out.println("This is the result");
		for(int x : a){
			System.out.print(x+" ");
		}
	}
}
