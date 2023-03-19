package simple;
/**
 * 36. 有效的数独
 * @author HJ
 */
public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {
		// 官方
		// 记录数独的每一行每个数字的出现次数
		int[][] rows = new int[9][9];
		// 记录数独的每一列每个数字的出现次数
		int[][] columns = new int[9][9];
		// 记录数独的每一个小九宫格中的每个数字的出现次数
		int[][][] subboxes = new int[3][3][9];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				char c = board[i][j];
				if (c != '.') {
					int index = c - '0' - 1;
					rows[i][index]++;
					columns[j][index]++;
					subboxes[i / 3][j / 3][index]++;
					if (rows[i][index] > 1 || columns[j][index] > 1 || subboxes[i / 3][j / 3][index] > 1) {
						return false;
					}
				}
			}
		}
		return true;
		
		// 位运算
		
	}

	public static void main(String[] args){
		ValidSudoku validSudoku = new ValidSudoku();
		char[][] board = {
			{'5','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'}
		};
		System.out.println(validSudoku.isValidSudoku(board));
	}

}