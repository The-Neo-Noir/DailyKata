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

public class GenTest {
    @org.junit.Test
    public void fsn() throws IOException {

        String html = "<table class=\"out\">\n" +
                "<tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr>\n" +
                "<tr><td>matchUp([1, 2, 3], [2, 3, 10]) → 2</td><td>2</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>matchUp([1, 2, 3], [2, 3, 5]) → 3</td><td>3</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>matchUp([1, 2, 3], [2, 3, 3]) → 2</td><td>2</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>matchUp([5, 3], [5, 5]) → 1</td><td>1</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>matchUp([5, 3], [4, 4]) → 2</td><td>2</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>matchUp([5, 3], [3, 3]) → 1</td><td>1</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>matchUp([5, 3], [2, 2]) → 1</td><td>1</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>matchUp([5, 3], [1, 1]) → 1</td><td>1</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>matchUp([5, 3], [0, 0]) → 0</td><td>0</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>matchUp([4], [4]) → 0</td><td>0</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>matchUp([4], [5]) → 1</td><td>1</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td><center>other tests</center></td><td></td><td>OK</td><td class=\"ok\"></td></tr>\n" +
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
                            String functionName = substring.substring(0, substring.indexOf("("));
                            String paramter = substring.substring(substring.indexOf("(") + 1, substring.length() - 2);
                            System.out.println("assertEquals(\"" + text + "\"," + buildString(text.substring(i1 + 2)) + ",task." + functionName + "(" + buildString(paramter) + "));");
                        }
                    }

                }
            }
        }

    }

    private static String buildString(String input) {
        if (input.contains("[")) { // for array type

            StringBuffer result= new StringBuffer();
            int numberOfElements = 0;
           //[1,2]
          //  [3,4],[3,2]
            StringBuffer intreme = new StringBuffer();
            for (char ch : input.toCharArray()) {
                if (ch == '[') {
                    intreme.append("{");

                } else if (ch == ']') {
                    intreme.append("}");
                    if(result.length()==0){
                        result.append("new int[]");
                    }else{
                        result.append(",new int[]");
                    }
                    result.append(intreme);
                    intreme = new StringBuffer();
                } else if(ch==','){
                     if(!intreme.toString().equals(""))
                        intreme.append(ch + "");
                }else{
                    intreme.append(ch + "");
                }
            }
            return result.toString();
        } else if (input.contains("true") || input.contains("false")) {
            return input;

        }else{
            return input;
        }
    }
}
