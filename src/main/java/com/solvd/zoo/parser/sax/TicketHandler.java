//package com.solvd.zoo.parser.sax;
//
//import com.solvd.zoo.models.TicketsModel;
//
//import org.xml.sax.Attributes;
//import org.xml.sax.SAXException;
//import org.xml.sax.helpers.DefaultHandler;
//
//public class TicketHandler extends DefaultHandler {
//    private static final String ID = "id";
//    private static final String PRICE = "price";
//    private static final String ISACTIVATE = "isActivate";
//    private static final String DATE = "dateOfVisit";
//
//    private TicketsModel ticketsModel;
//    private StringBuilder elementValue;
//
//    @Override
//    public void characters(char[] ch, int start, int length) throws SAXException {
//        if (elementValue == null) {
//            elementValue = new StringBuilder();
//        } else {
//            elementValue.append(ch, start, length);
//        }
//    }
//
//     @Override
//    public void startDocument() throws SAXException {
//        ticketsModel = new TicketsModel();
//    }
//
//    @Override
//    public void startElement(String uri, String lName, String qName, Attributes attr) throws SAXException {
//        switch (qName) {
//            case ID:
//                elementValue = new StringBuilder ();
//                break;
//            case PRICE:
//                elementValue = new StringBuilder ();
//                break;
//            case ISACTIVATE:
//                elementValue = new StringBuilder ();
//                break;
//            case DATE:
//                elementValue = new StringBuilder ();
//                break;
//        }
//    }
//
//    @Override
//    public void endElement(String uri, String localName, String qName) throws SAXException {
//        switch (qName) {
//            case ID:
//                ticketsModel.setId(Long.parseLong(elementValue.toString()));
//                break;
//            case PRICE:
//                ticketsModel.setPrice(Integer.parseInt(elementValue.toString()));
//                break;
//            case ISACTIVATE:
//                ticketsModel.setActivate(Boolean.parseBoolean(elementValue.toString()));
//                break;
//            case DATE:
//                ticketsModel.setDateOfVisit(elementValue.toString());
//                break;
//        }
//    }
//
//
//
//    public TicketsModel getTicket() {
//        return ticketsModel;
//    }
//}
