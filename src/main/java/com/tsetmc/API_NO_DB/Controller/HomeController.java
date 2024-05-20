package com.tsetmc.API_NO_DB.Controller;

import com.tsetmc.API_NO_DB.Model.Person;
import com.tsetmc.API_NO_DB.Service.IPersonService;
import com.tsetmc.API_NO_DB.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    IPersonService personInterface;
    @GetMapping(value = "/all")
    public List<Person> getAllPerson()
    {
        return personInterface.getAllPersons();
    }
}
