package main.simple;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 733. 图像渲染
 * @author HJ
 */
public class ImageRendering {

	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		//定义移动上下左右四种情况
		int[] dx = new int[]{1, 0, 0, -1};
		int[] dy = new int[]{0, 1, -1, 0};

		//矩阵行列边界
		int m = image.length;
		int n = image[0].length;

		//判断初始颜色相同时返回原图,因为在本次染色前,原图已经符合"油漆桶"标准
		int currColor = image[sr][sc];
		if (currColor == color) {
			return image;
		}

		//建立队列存储每一次要染色的方格x,y坐标
		Queue<int[]> queue = new LinkedList<>();
		//先将起始点染色
		queue.offer(new int[]{sr, sc});
		image[sr][sc] = color;

		//开始广度优先搜索
		//外层循环改变起始坐标,内层循环改变朝4个方向移动
		//外层循环判断条件,当队列为空,则涂色完成
		while (!queue.isEmpty()) {

			//分解坐标
			int cell[] = queue.poll();
			int x = cell[0];
			int y = cell[1];

			//坐标移动判断条件是x,y坐标移动均在矩阵内,且移动的下一个方格颜色与当前(染色前)方格相同;
			for (int i = 0; i < 4; i++) {
				//每一次改变起始坐标
				int mx = x + dx[i];
				int my = y + dy[i];

				if (mx >= 0 && mx < m && my >= 0 && my < n && image[mx][my] == currColor) {
					image[mx][my] = color;
					queue.offer(new int[]{mx, my});
				}
			}
		}

		return image;
	}

	public static void main(String[] args){
		ImageRendering rendering = new ImageRendering();
	}

}