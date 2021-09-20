package binaryfib;

public class BinaryFib {
	public static int binaryFib(int k){
		if(k == 0){
			return 0;
		}
		if(k == 1 || k == 2){
				return 1;
			}
		return binaryFib(k-2) + binaryFib(k-1);
		}
	    public static void main(String args[]) {
		int maxNumber = 10;
		System.out.print(maxNumber+" números de Fibonacci: ");
		for(int i = 0; i < maxNumber; i++){
				System.out.print(binaryFib(i) +" ");
			}

	    }
}
