package com.examples.webservice;

import com.examples.webservice.model.ws.schema.InquiryPersonRequest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;

@TestConfiguration
public class WebClientConfig {

    @Bean
    public WebServiceTemplate webServiceTemplate() throws Throwable {
        return new WebServiceTemplate(soapMessageFactory());
    }

    @Bean
    public MessageFactory messageFactory() throws Throwable {
        return MessageFactory.newInstance();
    }

    @Bean
    public SaajSoapMessageFactory soapMessageFactory() throws Throwable {
        return new SaajSoapMessageFactory(messageFactory());
    }

    @Bean
    public Jaxb2Marshaller inquiryPersonMarshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setPackagesToScan(InquiryPersonRequest.class.getPackageName());
        return jaxb2Marshaller;
    }
}
