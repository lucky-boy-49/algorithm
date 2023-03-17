package simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HJ
 * 118. 杨辉三角
 */
public class YangHuiTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        for(int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>(i);
            result.add(list);
            for(int j = 0; j <= i; j++) {
                if (j == 0) {
                    list.add(1);
                } else if (j == i) {
                    list.add(1);
                } else {
                    int left = result.get(i - 1).get(j - 1);
                    int right = result.get(i - 1).get(j);
                    list.add(left + right);
                }
            }
        }
        return result;

    }

    public static void main(String[] args){
        YangHuiTriangle triangle = new YangHuiTriangle();
        int numRows = 5;
        List<List<Integer>> generate = triangle.generate(numRows);
        for(int i = 0; i < generate.size(); i++) {
            for(int j = 0; j < generate.get(i).size(); j++) {
                System.out.print(generate.get(i).get(j) + "  ");
            }
            System.out.println();
        }
    }

}