package main.difficulty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 212. 单词搜索 II
 */
public class WordSearchIITwo {

    public static int n = 10001;
    public static int[][] tree = new int[n][26];
    public static int[] pass = new int[n];
    public static String[] end = new String[n];
    public static int cnt;

    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans = new ArrayList<>();
        clear();
        build(words);
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                dfs(board, i, j, 1, ans);
            }
        }
        return ans;
    }

    public static int dfs(char[][] board, int i, int j, int cur, List<String> ans){
        if(i < 0 || j >= board[0].length || i >= board.length || j < 0 || board[i][j] == 0){
            return 0;
        }
        char tmp = board[i][j];
        int path = tmp - 'a';
        cur = tree[cur][path];
        if(cur == 0 || pass[cur] == 0){
            return 0;
        }
        int fix = 0;
        if(end[cur] != null ){
            ans.add(end[cur]);
            end[cur] = null;
            fix++;
        }
        board[i][j] = 0;
        fix += dfs(board, i - 1, j, cur, ans);
        fix += dfs(board, i + 1, j, cur, ans);
        fix += dfs(board, i, j - 1, cur, ans);
        fix += dfs(board, i, j + 1, cur, ans);
        pass[cur] -= fix;
        board[i][j] = tmp;
        return fix;
    }

    public static void build(String[] words){
        cnt = 1;
        for(String str : words){
            int cur = 1;
            pass[cur]++;
            for(int i = 0, path; i < str.length(); i++){
                path = str.charAt(i) - 'a';
                if(tree[cur][path] == 0){
                    tree[cur][path] = ++cnt;
                }
                cur = tree[cur][path];
                pass[cur]++;
            }
            end[cur] = str;
        }
    }

    public static void clear(){
        for(int i = 1; i <= cnt; i++){
            Arrays.fill(tree[i], 0);
            pass[i] = 0;
            end[i] = null;
        }
    }
}