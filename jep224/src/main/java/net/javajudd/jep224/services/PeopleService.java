package net.javajudd.jep224.services;

import net.javajudd.jep224.domain.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Service providing access to people in the application.
 * @author javajudd
 * @since 1.0
 */
@Service
public interface PeopleService {

    /**
     * Find and Returns all people in the application.
     * @return All people.
     */
    List<Person> findAllPeople();

    /**
     * Find a specific user.
     * @param id Unique identifier of the person to be searched.
     * @return The person with that unique id.
     */
    Person findById(UUID id);
}
