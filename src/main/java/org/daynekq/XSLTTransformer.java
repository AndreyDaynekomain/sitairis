package org.daynekq;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XSLTTransformer {
    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(new File("src/main/resources/bookstore.xsl")));
            transformer.transform(new StreamSource(new File("src/main/resources/bookstore.xml")),
                    new StreamResult(new File("output/bookstore.html")));
            System.out.println("Transformation complete");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}