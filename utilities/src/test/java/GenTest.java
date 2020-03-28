import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.w3c.dom.NodeList;
import sun.awt.OSInfo;
import sun.misc.OSEnvironment;

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
        String parseText="→";
        int idex=2;
        if (!OSInfo.getOSType().equals(OSInfo.OSType.MACOSX)) {
            parseText = "";
            idex = 8;
        }

        String html = "<table class=\"out\">\n" +
                "<tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr>\n" +
                "<tr><td>count7(717) → 2</td><td>2</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(7) → 1</td><td>1</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(123) → 0</td><td>0</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(77) → 2</td><td>2</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(7123) → 1</td><td>1</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(771237) → 3</td><td>3</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(771737) → 4</td><td>4</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(47571) → 2</td><td>2</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(777777) → 6</td><td>6</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(70701277) → 4</td><td>4</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(777576197) → 5</td><td>5</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(99999) → 0</td><td>0</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>count7(99799) → 1</td><td>1</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
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
                        int i1 = text.indexOf(parseText);
                        if (i1 != -1) {
                            // assertEquals("mgs",)
                            String substring = text.substring(0, i1);
                            String functionName = substring.substring(0, substring.indexOf("("));
                            String paramter = substring.substring(substring.indexOf("(") + 1, substring.length() - 2);
                            System.out.println("assertEquals(\"" + text + "\"," + buildString(text.substring(i1 + idex)) + ",task." + functionName + "(" + buildString(paramter) + "));");
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
