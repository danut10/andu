package com.cegeka.test.ui.andreea;

public class Main {
	
	public static final int BRANCHES = 3;
	public static final char SPACE = ' ';
	public static final char STAR = '*';
	
	public static void main(String[] args) {
		
		int lines = BRANCHES * 3 + BRANCHES * (BRANCHES - 1)/2;
		int columns = (BRANCHES + 1) * 2 + 1;
        int[][] a = buildMatrix(lines, columns);
        printMatrix(a);

	}
	
    private static int[][] buildMatrix(int n, int m) {
        int[][] a = new int[n][m];
        int line = 0;
        for (int layer = 0; layer < BRANCHES; layer++) {
        	for(int i = 0; i < layer + 3; i++) {
                for(int j = 0; j < m; j++) {
                    a[line][j] = (j < (m-1)/2 - i) || (j > (m-1)/2 + i) ? 0 : 1;
                }
                line++;
            }
        }
        return a;
    }
    
    private static void printMatrix(int[][] a) {
        for(int i = 0; i < a.length; i ++ ) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] == 0 ? SPACE : STAR);
            }
            System.out.println();
        }
    }

}