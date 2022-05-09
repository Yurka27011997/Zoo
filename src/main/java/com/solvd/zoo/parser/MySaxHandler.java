package com.solvd.zoo.parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySaxHandler extends DefaultHandler {

    boolean foundId = false;
    boolean foundPrice = false;
    boolean foundIsActivate = false;
    boolean foundDate = false;

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {

        System.out.println("---------------------------");
        System.out.println("Start Element :" + qName);

        if (qName.equalsIgnoreCase("id")) {
            foundId = true;
        }

        if (qName.equalsIgnoreCase("price")) {
            foundPrice = true;
        }

        if (qName.equalsIgnoreCase("isActivate")) {
            foundIsActivate = true;
        }

        if (qName.equalsIgnoreCase("date")) {
            foundDate = true;
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        System.out.println("End Element :" + qName);
    }

    @Override
    public void characters(char ch[], int start, int length)
            throws SAXException {


        System.out.println("characters :");


        if (foundId) {
            System.out.println("Id No: " + new String(ch, start, length));
            foundId = false;
        }

        if (foundPrice) {
            System.out.println("Price : " + new String(ch, start, length));
            foundPrice = false;
        }

        if (foundIsActivate) {
            System.out.println("isActivate : " + new String(ch, start, length));
            foundIsActivate = false;
        }

        if (foundDate) {
            System.out.println("Date : " + new String(ch, start, length));
            foundDate = false;
        }

    }

}