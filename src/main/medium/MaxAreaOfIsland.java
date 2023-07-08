package main.medium;

/**
 * 695. 岛屿的最大面积
 * @author HJ
 */
public class MaxAreaOfIsland {

	public int maxAreaOfIsland(int[][] grid) {
		int m = grid.length, n = grid[0].length, result = 0;
		int[][] copyGrid = new int[m][n];
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1 && copyGrid[i][j] != 1) {
					result = Math.max(result, dfs(i, j, grid, copyGrid));
				}
			}
		}
		return result;
	}

	private int dfs(int i, int j, int[][] grid, int[][] copyGrid) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || copyGrid[i][j] == 1 || grid[i][j] == 0) {
			return 0;
		}
		copyGrid[i][j] = 1;
		int num = 1;
		num += dfs(i + 1, j, grid, copyGrid);
		num += dfs(i - 1, j, grid, copyGrid);
		num += dfs(i, j + 1, grid, copyGrid);
		num += dfs(i, j - 1, grid, copyGrid);
		return num;
	}

	public static void main(String[] args){
		int[][] grid = new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},
			{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},
			{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
		MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
		int i = maxAreaOfIsland.maxAreaOfIsland(grid);
		System.out.println(i);
	}

}