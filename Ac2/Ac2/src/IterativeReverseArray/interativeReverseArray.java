package IterativeReverseArray;

public class interativeReverseArray {
	int[] iterativeReverseArray(int[]A,int i,int j){
        while(i<j){
            int aux = A[i];
            A[i] = A[j];
            A[j] = aux;
            i = i+1;
            j = j-1;
        }
    return A;
    }
}
