import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Test {
    @org.junit.Test
    public void fsn() throws IOException {

        String html = "<table class=\"out\">\n" +
                "<tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr>\n" +
                "<tr><td>fizzArray(4) → [0, 1, 2, 3]</td><td>[<span class=\"no\">]</span></td><td>X</td><td class=\"no\"></td></tr>\n" +
                "\n" +
                "<tr><td>fizzArray(1) → [0]</td><td>[<span class=\"no\">]</span></td><td>X</td><td class=\"no\"></td></tr>\n" +
                "\n" +
                "<tr><td>fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]</td><td>[<span class=\"no\">]</span></td><td>X</td><td class=\"no\"></td></tr>\n" +
                "\n" +
                "<tr><td>fizzArray(0) → []</td><td>[]</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>fizzArray(2) → [0, 1]</td><td>[<span class=\"no\">]</span></td><td>X</td><td class=\"no\"></td></tr>\n" +
                "\n" +
                "<tr><td>fizzArray(7) → [0, 1, 2, 3, 4, 5, 6]</td><td>[<span class=\"no\">]</span></td><td>X</td><td class=\"no\"></td></tr>\n" +
                "\n" +
                "<tr><td><center>other tests</center></td><td></td><td>X</td><td class=\"no\"></td></tr>\n" +
                "</tbody></table>";
        Document doc = Jsoup.parseBodyFragment(html);
        Elements select = doc.select("table.out tr ");

        for (Element element : select) {
            Elements children = element.children();
            for (int i = 0; i < children.size(); i++) {
                if (i % 4 == 0) {
                    // if (!element.is("tr th")) {
                    Element element1 = children.get(i);
                    if (!element1.is("th")) {
                        String text = new String(element1.text().getBytes(
                                StandardCharsets.UTF_8));
                        int i1 = text.indexOf("→");
                        if (i1 != -1) {
                           // assertEquals("mgs",)
                            String substring = text.substring(0, i1);
                            String functionName=substring.substring(0,substring.indexOf("("));
                            String paramter =  substring.substring(substring.indexOf("(")+1,substring.length()-2);
                            System.out.println("assertEquals(\"" + text + "\"," + buildString(text.substring(i1 + 2)) + ",task." + functionName+"("+ buildString(paramter)+"));");
                        }
                    }

                }
            }
        }

    }
    private static String buildString(String input){
        if(input.contains("[")) { // for array type
            StringBuffer sb = new StringBuffer();
            sb.append("new int[]");
            int numberOfElements=0;
            StringBuffer intreme = new StringBuffer();
            for (char ch : input.toCharArray()) {
                if(ch=='[') {
                    intreme.append("{");
                    numberOfElements++;
                }else if(ch==']'){
                    intreme.append("}");
                }else{
                    intreme.append(ch+"");
                }
            }
            if (numberOfElements > 1) {
                sb.append("{").append(intreme).append("}");
            } else {
                sb.append(intreme);
            }
            return sb.toString();
        }else if( input.contains("true") || input.contains("false")){
            return input;
        }else{
            return input;
        }

    }

}
