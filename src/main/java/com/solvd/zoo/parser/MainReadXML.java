package com.solvd.zoo.parser;

import java.io.File;
import java.util.Date;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.solvd.zoo.models.TicketsModel;
import org.xml.sax.helpers.DefaultHandler;

public class MainReadXML {

    public static void main(String[] args) {

        TicketsModel ticketsModelEmpty = new TicketsModel();
        TicketsModel ticketsModelWithData = new TicketsModel(1,200,true, "21.05.2022");





        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new MySaxHandler();
            TicketHandler ticketHandler = new TicketHandler();


            File file = new File("F:\\SolvD\\LABA\\Laba_Data_Base\\Zoo_new\\Zoo\\src\\main\\resources\\XML\\zoo.xml");
            saxParser.parse(file, handler);
//            ticketsModelEmpty = ticketHandler.getTicket();
//            ticketsModelEmpty.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}