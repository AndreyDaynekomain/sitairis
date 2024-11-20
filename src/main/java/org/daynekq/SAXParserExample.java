package org.daynekq;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SAXParserExample {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {

                boolean titleFlag = false;
                boolean firstNameFlag = false;
                boolean lastNameFlag = false;
                boolean priceFlag = false;
                String currency = "";

                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("book")) {
                        String id = attributes.getValue("id");
                        String category = attributes.getValue("category");
                        System.out.println("Book ID: " + id + ", Category: " + category);
                    }
                    if (qName.equalsIgnoreCase("title")) {
                        titleFlag = true;
                    }
                    if (qName.equalsIgnoreCase("firstName")) {
                        firstNameFlag = true;
                    }
                    if (qName.equalsIgnoreCase("lastName")) {
                        lastNameFlag = true;
                    }
                    if (qName.equalsIgnoreCase("price")) {
                        priceFlag = true;
                        currency = attributes.getValue("currency");
                    }
                }

                public void characters(char ch[], int start, int length) throws SAXException {
                    if (titleFlag) {
                        System.out.println("Title: " + new String(ch, start, length));
                        titleFlag = false;
                    }
                    if (firstNameFlag) {
                        System.out.println("First Name: " + new String(ch, start, length));
                        firstNameFlag = false;
                    }
                    if (lastNameFlag) {
                        System.out.println("Last Name: " + new String(ch, start, length));
                        lastNameFlag = false;
                    }
                    if (priceFlag) {
                        System.out.println("Price: " + new String(ch, start, length) + " " + currency);
                        priceFlag = false;
                    }
                }
            };
            saxParser.parse(new File("src/main/resources/bookstore.xml"), handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}