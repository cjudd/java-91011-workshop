package net.javajudd.jep224.services;

import net.javajudd.jep224.domain.Person;

import java.util.List;
import java.util.UUID;

/**
 * Implementation of the PeopleService interface.
 */
public class PeopleServiceImpl implements PeopleService {
    @Override
    public List<Person> findAllPeople() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Person findById(UUID id) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
