package com.examples.webservice.endpoint;

import com.examples.webservice.model.ws.Person;
import com.examples.webservice.model.ws.schema.InquiryPersonRequest;
import com.examples.webservice.model.ws.schema.InquiryPersonResponse;
import com.examples.webservice.repository.PersonRepository;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Optional;

@Endpoint
public class PersonEndpoint {

    public static final String NAMESPACE_URI = "http://www.javasamples.com/ws";

    private PersonRepository personRepository;


    public PersonEndpoint(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "inquiryPersonRequest")
    @ResponsePayload
    public InquiryPersonResponse getCountry(@RequestPayload InquiryPersonRequest request) {
        Optional<Person> optionalPerson = personRepository.findPersonByUniqueCode(request.getUniqueCode());
        return new InquiryPersonResponse(optionalPerson.orElseThrow());
    }
}

