package com.codelearn.algorithm.backtracking;

public class Sudoku {
	private static int[][] lv1 = {{0, 0, 5, 1, 4, 0, 0, 0, 0},
	                             {0, 7, 0, 0, 0, 0, 3, 6, 0},
	                             {0, 0, 0, 0, 0, 0, 0, 0, 0},
	                             {2, 0, 0, 0, 0, 6, 8, 3, 0},
	                             {0, 0, 4, 5, 0, 0, 0, 0, 0},
	                             {0, 0, 0, 0, 0, 0, 0, 0, 0},
	                             {0, 0, 0, 4, 0, 0, 0, 0, 1},
	                             {6, 3, 0, 0, 0, 0, 0, 0, 0},
	                             {0, 0, 0, 0, 2, 0, 0, 0, 0}};
	public static int[][] boards = lv1;
	private static boolean[][] markR = new boolean[10][9];
	private static boolean[][] markC = new boolean[10][9];
	private static boolean[][][] markS = new boolean[10][3][3];

	public static void main(String[] args) {

		updateMark();
		backtrackingTry(0, 0);
		
		System.out.println("Done!");
	}

	private static void reNhanh(int r, int c) {
		if (r == 8 && c == 8) {
			printBoards(boards);
			System.exit(0);
		} else if (c == 8) {
			backtrackingTry(r + 1, 0);
		} else {
			backtrackingTry(r, c + 1);
		}
	}

	private static void backtrackingTry(int r, int c) {
		if (boards[r][c] == 0) {
			for (int v = 1; v <= 9; v++)
				if (check(v, r, c)) {
					int temp = boards[r][c];
					boards[r][c] = v;
					markR[v][r] = true;
					markC[v][c] = true;
					markS[v][r / 3][c / 3] = true;

					reNhanh(r, c);
					markR[v][r] = false;
					markC[v][c] = false;
					markS[v][r / 3][c / 3] = false;
					boards[r][c] = temp;

				}

		} else {
			reNhanh(r, c);
		}
	}

	private static boolean check(int v, int r, int c) {
		if (markR[v][r] == true || markC[v][c] == true || markS[v][r/3][c/3] == true) {
			return false;
		}
		
		return true;

	}

	public static void printBoards(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void updateMark() {
		for (int r = 0; r < boards.length; r++) {
			for (int c = 0; c < boards[0].length; c++) 
				if (boards[r][c] != 0) {
					int v = boards[r][c];
					markR[v][r] = true;
					markC[v][c] = true;
					markS[v][r / 3][c / 3] = true;

				}
			
		}
	}
	
	public static void updateBoards(int[][] arr) {
		boards = arr.clone();
	}
}
