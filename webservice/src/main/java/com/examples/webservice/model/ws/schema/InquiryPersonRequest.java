package com.examples.webservice.model.ws.schema;

import com.examples.webservice.endpoint.PersonEndpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(namespace = PersonEndpoint.NAMESPACE_URI)
@XmlType()
@XmlAccessorType(XmlAccessType.FIELD)
public class InquiryPersonRequest {

    private String uniqueCode;

    public InquiryPersonRequest() {
    }

    public InquiryPersonRequest(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }
}
