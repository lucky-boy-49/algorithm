package medium;

/**
 * @author HJ
 * @date 2023/4/25 21:14
 * @description 1410. HTML 实体解析器
 */
public class HtmlEntityParser {
    public String entityParser(String text) {
        String reg1="&quot;";
        String reg2="&apos;";
        String reg3="&amp;";
        String reg4="&gt;";
        String reg5="&lt;";
        String reg6="&frasl;";
        return text.replace(reg1,"\"").replace(reg2,"'").replace(reg6,"/").replace(reg4,">").replace(reg5,"<").replace(reg3,"&");
    }

    public static void main(String[] args) {
        String text = "&amp; is an HTML entity but &ambassador; is not.";
        HtmlEntityParser htmlEntityParser = new HtmlEntityParser();
        System.out.println(htmlEntityParser.entityParser(text));
    }

}
