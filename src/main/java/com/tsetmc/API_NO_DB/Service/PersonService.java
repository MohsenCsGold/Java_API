package com.tsetmc.API_NO_DB.Service;

import com.tsetmc.API_NO_DB.Model.Person;
import com.tsetmc.API_NO_DB.Repository.DataClass;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService implements IPersonService{
    @Override
    public List<Person> getAllPersons() {
        return (new DataClass()).GenerateData();
    }
}
