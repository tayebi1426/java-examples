package com.examples.webservice.model.ws.schema;

import com.examples.webservice.endpoint.PersonEndpoint;
import com.examples.webservice.model.ws.Person;

import javax.xml.bind.annotation.*;

@XmlRootElement(namespace = PersonEndpoint.NAMESPACE_URI)
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class InquiryPersonResponse {

    @XmlElement
    private Person person;

    public InquiryPersonResponse() {
    }

    public InquiryPersonResponse(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

