package com.examples.webservice;

import com.examples.webservice.model.ws.Person;
import com.examples.webservice.model.ws.schema.InquiryPersonRequest;
import com.examples.webservice.model.ws.schema.InquiryPersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

@Component
public class InquiryPersonWebClient {

    private WebServiceTemplate webServiceTemplate;

    public InquiryPersonWebClient(SaajSoapMessageFactory soapMessageFactory, Jaxb2Marshaller inquiryPersonMarshaller) {
        webServiceTemplate=new WebServiceTemplate(soapMessageFactory);
        webServiceTemplate.setMarshaller(inquiryPersonMarshaller);
        webServiceTemplate.setUnmarshaller(inquiryPersonMarshaller);
        webServiceTemplate.setDefaultUri("https://127.0.0.1:8001/ws");
    }

    public Person inquiryPerson(String uniqueCode) {
       InquiryPersonResponse response = (InquiryPersonResponse) webServiceTemplate.marshalSendAndReceive(new InquiryPersonRequest(uniqueCode));
       return response.getPerson();
    }
}