package com.cegeka.test.ui.andreea;

public class Main {
	
	public static final int nbOfLayers = 3;
	
	public static void main(String[] args) {
		
		int lines = nbOfLayers * 3 + nbOfLayers * (nbOfLayers - 1)/2;
		int columns = (nbOfLayers + 1) * 2 + 1;
        int[][] a = buildMatrix(lines, columns);
        printMatrix(a, lines, columns);

	}
	
    private static int[][] buildMatrix(int n, int m) {
        int[][] a = new int[n][m];
        int line = 0;
        for (int layer = 0; layer < nbOfLayers; layer++) {
        	for(int i = 0; i < layer + 3; i++) {
                for(int j = 0; j < m; j++) {
                    a[line][j] = (j < (m-1)/2 - i) || (j > (m-1)/2 + i) ? 0 : 1;
                }
                line++;
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



