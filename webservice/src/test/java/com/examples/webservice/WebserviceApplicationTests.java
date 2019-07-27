package com.examples.webservice;

import com.examples.webservice.model.ws.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebClientConfig.class)
public class WebserviceApplicationTests {

	@Autowired
	InquiryPersonWebClient inquiryPersonWebClient;
	@Test
	public void contextLoads() {
		Person person = inquiryPersonWebClient.inquiryPerson("1861247859");
		System.out.println("person : "+person.getFirstName());
	}

}
