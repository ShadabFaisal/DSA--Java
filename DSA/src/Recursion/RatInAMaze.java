package Recursion;

import java.util.ArrayList;

public class RatInAMaze {

	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };

		ArrayList<ArrayList<Integer>> maze = new ArrayList<>();

		for (int i = 0; i < mat.length; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for (int j = 0; j < mat[i].length; j++) {
				row.add(mat[i][j]);
			}
			maze.add(row);
		}

		System.out.println(findPath(maze));

	}

	// Function to find all possible paths
	public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
		// code here
		int n = mat.size();
		ArrayList<String> ans = new ArrayList<>();
		int[][] vis = new int[n][n];
		String move = "";
		solve(0, 0, mat, ans, n, vis, move);
		return ans;
	}

	public static void solve(int i, int j, ArrayList<ArrayList<Integer>> mat, ArrayList<String> ans, int n, int[][] vis,
			String move) {
		if (i == n - 1 && j == n - 1) {
			ans.add(move);
			return;
		}
		// downward
		if (i + 1 < n && vis[i + 1][j] == 0 && mat.get(i + 1).get(j) == 1) {
			vis[i][j] = 1;
			solve(i + 1, j, mat, ans, n, vis, move + 'D');
			vis[i][j] = 0;
		}
		// left
		if (j - 1 >= 0 && vis[i][j - 1] == 0 && mat.get(i).get(j - 1) == 1) {
			vis[i][j] = 1;
			solve(i, j - 1, mat, ans, n, vis, move + 'L');
			vis[i][j] = 0;
		}
		// right
		if (j + 1 < n && vis[i][j + 1] == 0 && mat.get(i).get(j + 1) == 1) {
			vis[i][j] = 1;
			solve(i, j + 1, mat, ans, n, vis, move + 'R');
			vis[i][j] = 0;
		}
		// Up
		if (i - 1 >= 0 && vis[i - 1][j] == 0 && mat.get(i - 1).get(j) == 1) {
			vis[i][j] = 1;
			solve(i - 1, j, mat, ans, n, vis, move + 'U');
			vis[i][j] = 0;
		}
	}

}
