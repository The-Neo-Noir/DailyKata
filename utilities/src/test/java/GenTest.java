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
                "<tr><td>modThree([2, 1, 3, 5]) → true</td><td>false</td><td>X</td><td class=\"no\"></td></tr>\n" +
                "\n" +
                "<tr><td>modThree([2, 1, 2, 5]) → false</td><td>false</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>modThree([2, 4, 2, 5]) → true</td><td>false</td><td>X</td><td class=\"no\"></td></tr>\n" +
                "\n" +
                "<tr><td>modThree([1, 2, 1, 2, 1]) → false</td><td>false</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>modThree([9, 9, 9]) → true</td><td>false</td><td>X</td><td class=\"no\"></td></tr>\n" +
                "\n" +
                "<tr><td>modThree([1, 2, 1]) → false</td><td>false</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>modThree([1, 2]) → false</td><td>false</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>modThree([1]) → false</td><td>false</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>modThree([]) → false</td><td>false</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>modThree([9, 7, 2, 9]) → false</td><td>false</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>modThree([9, 7, 2, 9, 2, 2]) → false</td><td>false</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>modThree([9, 7, 2, 9, 2, 2, 6]) → true</td><td>false</td><td>X</td><td class=\"no\"></td></tr>\n" +
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
