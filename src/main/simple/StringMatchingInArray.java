package main.simple;

import java.util.*;

/**
 * @author HJ
 * @date 2023/4/25 17:15
 * @description 1408. 数组中的字符串匹配
 */
public class StringMatchingInArray {

    /**
     * 自己方法
     * @param words 单词数组
     * @return 匹配结果
     */
    public List<String> stringMatching(String[] words) {
        LinkedList<String> result = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    int i1 = words[i].indexOf(words[j]);
                    if (i1 != -1) {
                        set.add(j);
                    }
                    i1 = words[j].indexOf(words[i]);
                    if (i1 != -1) {
                        set.add(i);
                    }
                }
            }
        }
        for (int i1 : set) {
            result.add(words[i1]);
        }
        return result;
    }

    /**
     * 暴力枚举：对于字符串数组中的某个字符串 words[i]\textit{words}[i]words[i]，我们判断它是否是其他字符串的子字符串，只需要枚举 words[j]\textit{words}[j]words[j]，其中 j≠ij \ne ij
     * 
     * =i，如果 words[i]\textit{words}[i]words[i] 是 words[j]\textit{words}[j]words[j] 的子字符串，那么将 words[i]\textit{words}[i]words[i] 加入结果中。
     */
    public List<String> stringMatching2(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero"};
        StringMatchingInArray array = new StringMatchingInArray();
        for (String s : array.stringMatching2(words)) {
            System.out.println(s);
        }
    }

}
