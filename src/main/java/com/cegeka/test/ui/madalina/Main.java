package com.cegeka.test.ui.madalina;

public class Main {
	
	public static  int nbOfRows = 3;
	
	public static void main(String[] args) {
		
		int lines = nbOfRows * 3 + nbOfRows * (nbOfRows - 1)/2;
		int columns = (nbOfRows + 1) * 2 + 1;
        int[][] a = buildTree(lines, columns);
        printTree(a, lines, columns);

	}
	
    private static int[][] buildTree(int n, int m) {
        int[][] a = new int[n][m];
        int row = 0;
        for (int layer = 0; layer < nbOfRows; layer++) {
        	for(int i = 0; i < layer + 3; i++) {
                for(int column = 0; column < m; column++) {
                    a[row][column] = (column < (m-1)/2 - i) || (column > (m-1)/2 + i) ? 0 : 1;
                }
                row++;
            }
        }
        return a;
    }
    
    private static void printTree(int[][] a, int n, int m) {
        for(int i = 0; i < n; i ++ ) {
            for(int j = 0; j < m; j++) {
                System.out.print(a[i][j] %2 == 0 ? " " : "*");
            }
            System.out.println();
        }
    }

}



