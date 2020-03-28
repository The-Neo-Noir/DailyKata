package com.curiousneds;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import sun.awt.OSInfo;

import javax.xml.namespace.QName;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ConvertTotable {
    public static void main(String[] args) throws MalformedURLException {
        String parseText = "→";
        int idex = 2;

        if (!OSInfo.getOSType().equals(OSInfo.OSType.MACOSX)) {
            parseText = "";
            idex = 8;
        }

        String html = "<table class=\"out\">\n" +
                "<tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr>\n" +
                "<tr><td>sumDigits(126) → 9</td><td>9</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>sumDigits(49) → 13</td><td>13</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>sumDigits(12) → 3</td><td>3</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>sumDigits(10) → 1</td><td>1</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>sumDigits(1) → 1</td><td>1</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>sumDigits(0) → 0</td><td>0</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>sumDigits(730) → 10</td><td>10</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>sumDigits(1111) → 4</td><td>4</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>sumDigits(11111) → 5</td><td>5</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>sumDigits(10110) → 3</td><td>3</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td>sumDigits(235) → 10</td><td>10</td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "\n" +
                "<tr><td><center>other tests</center></td><td></td><td>OK</td><td class=\"ok\"></td></tr>\n" +
                "</tbody></table>";
        Document doc = Jsoup.parseBodyFragment(html);
        Elements select = doc.select("table.out tr ");
        System.out.println("Task task = new Task();");
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