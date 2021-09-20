package binarysum;

public class binarySum {
	
	public static void main(String[] args) {

	    int[][] data = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
	    System.out.println(sum(data, 0, 3, 0, 4));
	}

	public static int sum(int[][] data, int x, int n1, int y, int n2) {

	    if (n1 == 1 && n2 == 1) {
	        return data[x][y];
	    }
	    if (n1 == 1) {
	        return sum(data, x, n1, y, (n2 / 2)) + sum(data, x, n1, y + (n2 / 2), n2 - (n2 / 2));
	    } else {
	        return sum(data, x, (n1 / 2), y, n2) + sum(data, x + (n1 / 2), n1 - (n1 / 2), y, n2);
	    }
	}

}
