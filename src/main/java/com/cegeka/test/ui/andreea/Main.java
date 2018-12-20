package com.cegeka.test.ui.andreea;

public class Main {
	
	public static void main(String[] args) {
        int[][] a = buildMatrix(3, 5);
        printMatrix(a, 3, 5);

	}
	
    private static int[][] buildMatrix(int n, int m) {
        int[][] a = new int[n][m];
        for(int i = 0; i < n; i ++ ) {
            for(int j = 0; j < m; j++) {
                a[i][j] = (j<(m-1)/2 - i) || (j > (m-1)/2 + i) ? 0 : 1;
            }
        }
        return a;
    }
    
    private static void printMatrix(int[][] a, int n, int m) {
        for(int i = 0; i < n; i ++ ) {
            for(int j = 0; j < m; j++) {
                System.out.print(a[i][j] == 0 ? " " : "*");
            }
            System.out.println();
        }
    }

}
