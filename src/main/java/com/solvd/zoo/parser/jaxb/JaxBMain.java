package com.solvd.zoo.parser.jaxb;

import com.solvd.zoo.MyConnection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.File;

public class JaxBMain {
    private static final Logger LOGGER = LogManager.getLogger(MyConnection.class);
    public static void main(String[] args) {
        try {
            jaxbWrite();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        jaxbRead();
    }

        public static void jaxbWrite () throws JAXBException {
            JaxBEmployee jaxBEmployee = new JaxBEmployee("Employee", 1, "Yurii", "Hnatiuk", "Yurii@leoni.com", "+380672214782");
            File file = new File("src/main/resources/XML/JaxB_empty.xml");
            try {
                JAXBContext context = JAXBContext.newInstance(JaxBEmployee.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.marshal(jaxBEmployee, file);
                LOGGER.info("Data to file was write successfully");
            } catch (JAXBException e) {
                e.printStackTrace();
            }

        }
    public static void jaxbRead() {
        File file = new File("src/main/resources/XML/JaxB_full.xml");
        try {
            JAXBContext context = JAXBContext.newInstance(JaxBEmployee.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            JaxBEmployee jaxBEmployee = (JaxBEmployee) unmarshaller.unmarshal(file);
            if (jaxBEmployee != null) {
                LOGGER.info("Data from file read successfully");
                LOGGER.info(jaxBEmployee.toString());
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }




}
