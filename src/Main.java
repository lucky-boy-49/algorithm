import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 控制台接收字符
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        // 转小写
        str = str.toLowerCase();
        for (int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            // 这里判断就只会有字符a-z进去，其他的进不去 else哪里也不用在判断
            if (c >= 'a' && c <= 'z') {
                if(map.containsKey(c)){
                    // 如果有+1
                    map.put(c,map.get(c)+1);
                }else {
                    // 没有为1
                    map.put(c,1);
                }
            }
        }
        Integer maxNum = Collections.max(map.values());
        Set<Character> set = new HashSet<>();
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue().equals(maxNum)){
                set.add(entry.getKey());
            }
        }
        String s = "";
        for (Character i: set) {
            s += i;
        }
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for(int i = 0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}