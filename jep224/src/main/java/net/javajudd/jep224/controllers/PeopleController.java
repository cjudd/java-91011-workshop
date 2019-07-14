package net.javajudd.jep224.controllers;

import net.javajudd.jep224.domain.Person;
import net.javajudd.jep224.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    PeopleService peopleService;

    @RequestMapping({"","/"})
    public List<Person> index() {
        return peopleService.findAllPeople();
    }



}