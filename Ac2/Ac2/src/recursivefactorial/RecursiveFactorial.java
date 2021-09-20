package recursivefactorial;

public class RecursiveFactorial {
	public static int recursiveFactorial(int n){
		
		if (n == 0) return 1;
		else return n * recursiveFactorial(n - 1);
		
	}
	
public static void main(String args[]) {
	int i,fact=1;
	int number = 4;
	fact = recursiveFactorial(number);
	System.out.println("o Fatorial de "+number+" é: " +fact);
	}

}
