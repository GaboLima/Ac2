package linearfibonacci;

public class LinearFibonacci {
	static int k=0,i=1,j=0;
	static void printFibonacci(int count){    
		if(count>0){    
	         j = k + i;    
	         k = i;    
	         i = j;    
	         System.out.print(" "+j);   
	         printFibonacci(count-1);    
	     }
	}

	public static void main(String args[]){    
		  int count=10;    
		  System.out.print(k+" "+i);
		  printFibonacci(count-2);

	}
}
