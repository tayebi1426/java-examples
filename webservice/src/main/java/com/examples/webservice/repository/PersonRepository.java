package com.examples.webservice.repository;

import com.examples.webservice.model.ws.Person;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class PersonRepository {
    private Map<String, Person> personMap;

    public PersonRepository() {
        personMap = new HashMap<>(5);
        personMap.put("1861247859", new Person("1861247859", "Hadi", "Tayebi", (byte) 36));
        personMap.put("1257465895", new Person("1257465895", "Ali", "Amoie", (byte) 26));
        personMap.put("0556254785", new Person("0556254785", "Amin", "Mohammadi", (byte) 20));
    }

    public Optional<Person> findPersonByUniqueCode(String uniqueCode) {
        return Optional.of(personMap.get(uniqueCode));
    }
}
