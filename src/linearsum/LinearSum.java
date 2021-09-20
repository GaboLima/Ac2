package linearsum;

public class LinearSum {
	public static void main(String[] args) {
		
		int[] arr={0,1,2,3,4,5,6};
		int length=arr.length;
		System.out.println(linearSum(arr,length));
	}
	
	
	public static int linearSum(int[] a , int n) {
		
		if(n==1) {
			return a[0];
		}
		
		else if(n > 0) {
			return linearSum(a, n-1)+a[n-1];
		}
		else {
			return -1;
		}
	}

}
