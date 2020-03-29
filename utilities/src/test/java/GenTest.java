import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.w3c.dom.NodeList;
import sun.awt.OSInfo;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GenTest {
    @org.junit.Test
    @SuppressWarnings(value = "his")
    public void fsn( String html, String path) throws IOException {
        String parseText = "→";
        int idex = 2;

        if (!OSInfo.getOSType().equals(OSInfo.OSType.MACOSX)) {
            parseText = "â†’";
            idex = 8;
        }

     //   String html = "<table class=\"out\" style=\"user-select: auto !important; border-collapse: collapse; color: rgb(0, 0, 0); font-family: verdana, arial, helvetica, sans-serif; font-size: small; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-style: initial; text-decoration-color: initial;\"><tbody style=\"user-select: auto !important;\"><tr style=\"user-select: auto !important;\"><th style=\"user-select: auto !important;\">Expected</th><th style=\"user-select: auto !important;\">Run</th><th style=\"user-select: auto !important;\"></th><th style=\"user-select: auto !important;\"></th></tr><tr style=\"user-select: auto !important;\"><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">[1, 2, 0, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">OK</td><td class=\"ok\" style=\"user-select: auto !important; vertical-align: top; min-width: 22px; background-color: green; border: 2px solid black; padding: 4px;\"></td></tr><tr style=\"user-select: auto !important;\"><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">withoutTen([10, 2, 10]) → [2, 0, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">[2, 0, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">OK</td><td class=\"ok\" style=\"user-select: auto !important; vertical-align: top; min-width: 22px; background-color: green; border: 2px solid black; padding: 4px;\"></td></tr><tr style=\"user-select: auto !important;\"><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">withoutTen([1, 99, 10]) → [1, 99, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">[1, 99, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">OK</td><td class=\"ok\" style=\"user-select: auto !important; vertical-align: top; min-width: 22px; background-color: green; border: 2px solid black; padding: 4px;\"></td></tr><tr style=\"user-select: auto !important;\"><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">withoutTen([10, 13, 10, 14]) → [13, 14, 0, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">[13, 14, 0, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">OK</td><td class=\"ok\" style=\"user-select: auto !important; vertical-align: top; min-width: 22px; background-color: green; border: 2px solid black; padding: 4px;\"></td></tr><tr style=\"user-select: auto !important;\"><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">withoutTen([10, 13, 10, 14, 10]) → [13, 14, 0, 0, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">[13, 14, 0, 0, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">OK</td><td class=\"ok\" style=\"user-select: auto !important; vertical-align: top; min-width: 22px; background-color: green; border: 2px solid black; padding: 4px;\"></td></tr><tr style=\"user-select: auto !important;\"><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">withoutTen([10, 10, 3]) → [3, 0, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">[3, 0, 0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">OK</td><td class=\"ok\" style=\"user-select: auto !important; vertical-align: top; min-width: 22px; background-color: green; border: 2px solid black; padding: 4px;\"></td></tr><tr style=\"user-select: auto !important;\"><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">withoutTen([1]) → [1]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">[1]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">OK</td><td class=\"ok\" style=\"user-select: auto !important; vertical-align: top; min-width: 22px; background-color: green; border: 2px solid black; padding: 4px;\"></td></tr><tr style=\"user-select: auto !important;\"><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">withoutTen([13, 1]) → [13, 1]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">[13, 1]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">OK</td><td class=\"ok\" style=\"user-select: auto !important; vertical-align: top; min-width: 22px; background-color: green; border: 2px solid black; padding: 4px;\"></td></tr><tr style=\"user-select: auto !important;\"><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">withoutTen([10]) → [0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">[0]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">OK</td><td class=\"ok\" style=\"user-select: auto !important; vertical-align: top; min-width: 22px; background-color: green; border: 2px solid black; padding: 4px;\"></td></tr><tr style=\"user-select: auto !important;\"><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">withoutTen([]) → []</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">[]</td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">OK</td><td class=\"ok\" style=\"user-select: auto !important; vertical-align: top; min-width: 22px; background-color: green; border: 2px solid black; padding: 4px;\"></td></tr><tr style=\"user-select: auto !important;\"><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\"><center style=\"user-select: auto !important;\">other tests</center></td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\"></td><td style=\"user-select: auto !important; vertical-align: top; border: 2px solid black; padding: 4px;\">OK</td><td class=\"ok\" style=\"user-select: auto !important; vertical-align: top; min-width: 22px; background-color: green; border: 2px solid black; padding: 4px;\"></td></tr></tbody></table>";

        Document doc = Jsoup.parseBodyFragment(html);
        Elements select = doc.select("table");
        System.out.println("Task task = new Task();");
        String x = "";
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
                        x      = "assertEquals(\"" + text + "\"," + buildString(text.substring(i1 + idex)) + ",task." + functionName + "(" + buildString(paramter) + "));";
                            System.out.println(x);
                        }
                    }

                }
            }
        }
        StringBuffer sb= new StringBuffer();
        sb.append(" @Test\n" +
                "  public void testSolution()");
        sb.append("Task task = new Task();\n");
        sb.append(x);
        sb.append("}");

        File f = new File(path+File.separator+"test"+File.separator+"Test.java");
        FileWriter fileWriter = new FileWriter(f);
        fileWriter.append(sb.toString());
        fileWriter.flush();;
        fileWriter.close();


    }

    private static String buildString(String input) {
        if (input.contains("[")) { // for array type

            StringBuffer result = new StringBuffer();
            int numberOfElements = 0;
            //[1,2]
            //  [3,4],[3,2]
            StringBuffer intreme = new StringBuffer();
            for (char ch : input.toCharArray()) {
                if (ch == '[') {
                    intreme.append("{");

                } else if (ch == ']') {
                    intreme.append("}");
                    if (result.length() == 0) {
                        result.append("new int[]");
                    } else {
                        result.append(",new int[]");
                    }
                    result.append(intreme);
                    intreme = new StringBuffer();
                } else if (ch == ',') {
                    if (!intreme.toString().equals(""))
                        intreme.append(ch + "");
                } else {
                    intreme.append(ch + "");
                }
            }
            return result.toString();
        } else if (input.contains("true") || input.contains("false")) {
            return input;

        } else {
            return input;
        }
    }
}
