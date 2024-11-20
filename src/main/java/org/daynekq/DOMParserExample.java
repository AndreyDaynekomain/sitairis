package org.daynekq;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.File;

public class DOMParserExample {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("src/main/resources/bookstore.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList bookList = doc.getElementsByTagName("book");

            for (int i = 0; i < bookList.getLength(); i++) {
                Element bookElement = (Element) bookList.item(i);
                String id = bookElement.getAttribute("id");
                String category = bookElement.getAttribute("category");
                String title = bookElement.getElementsByTagName("title").item(0).getTextContent();
                String firstName = bookElement.getElementsByTagName("firstName").item(0).getTextContent();
                String lastName = bookElement.getElementsByTagName("lastName").item(0).getTextContent();
                String publisher = bookElement.getElementsByTagName("name").item(0).getTextContent();
                String year = bookElement.getElementsByTagName("year").item(0).getTextContent();
                String price = bookElement.getElementsByTagName("price").item(0).getTextContent();
                String currency = bookElement.getElementsByTagName("price").item(0).getAttributes().getNamedItem("currency").getTextContent();

                System.out.println("ID: " + id + ", Category: " + category + ", Title: " + title);
                System.out.println("Author: " + firstName + " " + lastName);
                System.out.println("Publisher: " + publisher + ", Year: " + year);
                System.out.println("Price: " + price + " " + currency);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}